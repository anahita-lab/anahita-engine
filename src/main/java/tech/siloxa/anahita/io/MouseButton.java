package tech.siloxa.anahita.io;

public class MouseButton {

    private int buttonId;
    public boolean clicked = false;

    public MouseButton(Mouse mouse) {
        this.buttonId = mouse.buttonId;
    }

    public int getId() {
        return buttonId;
    }

    public void toggle(final boolean clicked) {
        if (clicked != this.clicked) {
            this.clicked = clicked;
        }
    }
}
