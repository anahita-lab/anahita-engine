package tech.siloxa.anahita.io;

public enum Mouse {

    LEFT(1),
    RIGHT(3);

    public final int buttonId;

    Mouse(int buttonId) {
        this.buttonId = buttonId;
    }
}
