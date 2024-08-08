package tech.siloxa.anahita.controller;

public class InputController {

    private AbstractKeyboardController keyboardController;
    private AbstractMouseController mouseController;

    public AbstractKeyboardController keyboardController() {
        return keyboardController;
    }

    public void setKeyboardController(AbstractKeyboardController keyboardController) {
        this.keyboardController = keyboardController;
    }

    public AbstractMouseController mouseController() {
        return mouseController;
    }

    public void setMouseController(AbstractMouseController mouseController) {
        this.mouseController = mouseController;
    }
}
