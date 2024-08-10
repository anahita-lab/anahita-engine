package tech.siloxa.anahita.window;

import tech.siloxa.anahita.io.InputController;
import tech.siloxa.anahita.grapichs.Screen;
import tech.siloxa.anahita.window.AbstractPanel;

import java.awt.*;

public class AnahitaPanel extends AbstractPanel {

    private int r;
    private int g;
    private int b;

    public AnahitaPanel(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public void input(Screen screen) {
        final InputController io = screen.input();
        addKeyListener(io.keyboardController());
        addMouseListener(io.mouseController());
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub

    }

    @Override
    public void render(Graphics2D graphics, Screen screen) {
        graphics.setColor(new Color(r, g, b));
        graphics.fillRect(0, 0, getWidth(), getHeight());
        screen.render(graphics);
    }
}
