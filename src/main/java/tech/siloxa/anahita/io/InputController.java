package tech.siloxa.anahita.io;

public class InputController {

    private AbstractKeyboardController keyboardController;
    private AbstractMouseController mouseController;

    public InputController(AbstractKeyboardController keyboardController, AbstractMouseController mouseController) {
        this.keyboardController = keyboardController;
        this.mouseController = mouseController;
    }

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
