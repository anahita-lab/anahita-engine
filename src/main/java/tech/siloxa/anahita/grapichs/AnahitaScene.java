package tech.siloxa.anahita.grapichs;

import java.awt.*;

public class AnahitaScene extends DynamicScene {

    @Override
    public Map map() {
        return null;
    }

    @Override
    public int x() {
        return 0;
    }

    @Override
    public int y() {
        return 0;
    }

    @Override
    public void render(Graphics2D graphics) {
        graphics.setColor(Color.GRAY);
        graphics.fillRect(100, 50, 100, 100);
    }
}
