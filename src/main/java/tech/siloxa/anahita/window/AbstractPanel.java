package tech.siloxa.anahita.window;

import tech.siloxa.anahita.grapichs.Screen;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractPanel extends JPanel {

    public void construct(Dimension dimension) {
        setPreferredSize(dimension);
        setFocusable(true);
        requestFocus();
    }

    public abstract void update();

    public abstract void input(Screen screen);

    public abstract void render(Graphics2D graphics, Screen screen);
}