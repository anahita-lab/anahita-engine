package tech.siloxa.anahita;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.siloxa.anahita.engine.FrameRate;
import tech.siloxa.anahita.engine.GameStateManager;
import tech.siloxa.anahita.grapichs.AnahitaGraphic;
import tech.siloxa.anahita.grapichs.Graphic;
import tech.siloxa.anahita.window.AbstractWindow;
import tech.siloxa.anahita.window.AnahitaWindow;
import tech.siloxa.anahita.window.panel.AbstractPanel;
import tech.siloxa.anahita.window.panel.AnahitaPanel;

import java.awt.*;

public class Anahita implements Runnable {

    private static final Logger log = LoggerFactory.getLogger(Anahita.class);

    private final String[] args;
    private AbstractWindow window;
    private Graphic graphic;
    private Thread gameLoop;
    private FrameRate frameRate;
    private GameStateManager gameStateManager;

    public Anahita(String[] args, Class<?>... primarySources) {
        this.args = args;
    }

    @Override
    public void run() {
        runEngine();
        runLoop();
    }

    private void runEngine() {
        setupEngine();
        runWindow();
    }

    private void setupEngine() {
        this.frameRate = createFrameRateInstance();
        this.gameStateManager = new GameStateManager();
    }

    private FrameRate createFrameRateInstance() {
        return new FrameRate(
                60
//                Integer.parseInt(
//                        this.context.getEnvironment().getProperty("pixel.engine.frame-rate", "60")
//                )
        );
    }

    private void runWindow() {
        this.window = getWindowInstance();
        this.graphic = new AnahitaGraphic(this.window.getDimension());
        final AbstractPanel panel = getPanelInstance();
        panel.construct(this.window.getDimension());

        this.window.construct(panel);
    }

    private AbstractWindow getWindowInstance() {
//        if (getClassByWindowAnnotation().isPresent()) {
//            return getClassByWindowAnnotation().get();
//        }
        return createPixelWindowInstance();
    }

    private AnahitaWindow createPixelWindowInstance() {
//        if (this.context.getEnvironment().getProperty("pixel.window.fullscreen", Boolean.class, false)) {
//            return new AnahitaWindow(
//                    this.context.getEnvironment().getProperty("pixel.window.title", this.mainApplicationClass.getSimpleName()),
//                    this.context.getEnvironment().getProperty("pixel.window.undecorated", Boolean.class, false)
//            );
//        }
//        return new AnahitaWindow(
//                this.context.getEnvironment().getProperty("pixel.window.title", this.mainApplicationClass.getSimpleName()),
//                this.context.getEnvironment().getProperty("pixel.window.undecorated", Boolean.class, false),
//                this.context.getEnvironment().getProperty("pixel.window.width", Integer.class, 400),
//                this.context.getEnvironment().getProperty("pixel.window.height", Integer.class, 400)
//        );
        return new AnahitaWindow(
                "title",
                false,
                400,
                400
        );
    }

    private AbstractPanel getPanelInstance() {
//        if (getClassByPanelAnnotation().isPresent()) {
//            return getClassByPanelAnnotation().get();
//        }
//        return new PixelPanel(
//                this.context.getEnvironment().getProperty("pixel.panel.background-color.r", Integer.class, 240),
//                this.context.getEnvironment().getProperty("pixel.panel.background-color.g", Integer.class, 148),
//                this.context.getEnvironment().getProperty("pixel.panel.background-color.b", Integer.class, 73)
//        );
        return new AnahitaPanel(
                240,
                148,
                73
        );
    }

    private void runLoop() {
        gameLoop = new Thread(this::loop);
        gameLoop.start();
    }

    private void loop() {
        frameRate.init();
        int lastFPS = 0;
        while (true) {
            if (frameRate.shouldRender()) {
                update();
                input();
                render();
                draw();
                frameRate.calculate();
            }
            lastFPS = logFPS(lastFPS);
        }
    }

    private void update() {
        this.window.getPanel().update();
    }

    public void input() {
        //this.panel.input(this.controller);
    }

    private void render() {
        this.window.getPanel().render(this.graphic.get2DGraphic(), gameStateManager.currentScene());
    }

    private void draw() {
        Graphics g = this.window.getPanel().getGraphics();
        g.drawImage(
                this.graphic.getBufferedImage(),
                0,
                0,
                this.window.getDimension().width,
                this.window.getDimension().height, null);
        g.dispose();
    }

    private int logFPS(int lastFPS) {
        if (frameRate.getFPS() != lastFPS) {
            lastFPS = frameRate.getFPS();
            log.info("The Engine is running on " + lastFPS + "FPS");
        }
        return lastFPS;
    }
}