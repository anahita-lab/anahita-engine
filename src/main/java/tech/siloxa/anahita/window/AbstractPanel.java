package tech.siloxa.anahita.window;

import tech.siloxa.anahita.controller.InputController;
import tech.siloxa.anahita.grapichs.Screen;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractPanel extends JPanel {

    private Screen screen;

    public void construct(Dimension dimension) {
        setPreferredSize(dimension);
        setFocusable(true);
        requestFocus();
    }

    public void setScene(Screen screen) {
        this.screen = screen;
    }

    public abstract void update();

    public abstract void input(InputController controller);

    public abstract void render(Graphics2D graphics, Screen screen);
}