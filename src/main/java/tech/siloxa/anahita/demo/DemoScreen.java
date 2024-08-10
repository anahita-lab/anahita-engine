package tech.siloxa.anahita.demo;

import tech.siloxa.anahita.io.InputController;
import tech.siloxa.anahita.grapichs.DynamicScreen;
import tech.siloxa.anahita.grapichs.Map;

import java.awt.*;

public class DemoScreen extends DynamicScreen {

    final DemoKeyboardController keyboardController = new DemoKeyboardController();
    final DemoMouseController mouseController = new DemoMouseController();

    @Override
    public Map map() {
        return null;
    }

    @Override
    public InputController input() {
        return new InputController(keyboardController, mouseController);
    }

    @Override
    public void render(Graphics2D graphics) {
        graphics.setColor(Color.GRAY);
        graphics.fillRect(100, 50, 100, 100);
    }
}
