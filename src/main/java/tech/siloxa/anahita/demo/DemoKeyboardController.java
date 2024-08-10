package tech.siloxa.anahita.demo;

import tech.siloxa.anahita.io.AbstractKeyboardController;
import tech.siloxa.anahita.io.Key;

import java.awt.event.KeyEvent;
import java.util.List;

public class DemoKeyboardController extends AbstractKeyboardController {

    public final Key up = new Key(KeyEvent.VK_W);
    public final Key down = new Key(KeyEvent.VK_S);

    public DemoKeyboardController() {
        init(List.of(up, down));
    }
}
