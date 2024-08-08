package tech.siloxa.anahita.demo;

import tech.siloxa.anahita.controller.AbstractKeyboardController;
import tech.siloxa.anahita.controller.Key;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class AnahitaKeyboardController extends AbstractKeyboardController {

    private static final Key up = new Key(KeyEvent.VK_W);
    private static final Key down = new Key(KeyEvent.VK_S);

    public AnahitaKeyboardController() {
        super(List.of(up, down));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        super.keyTyped(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        super.keyReleased(e);
    }
}
