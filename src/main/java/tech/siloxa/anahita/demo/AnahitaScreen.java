package tech.siloxa.anahita.demo;

import tech.siloxa.anahita.grapichs.DynamicScreen;
import tech.siloxa.anahita.grapichs.Map;

import java.awt.*;

public class AnahitaScreen extends DynamicScreen {

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
