package tech.siloxa.anahita.io;

public class Key {

    private int keyId;
    private int presses;
    private int absorbs;
    public boolean pressed;
    public boolean clicked;

    public Key(int keyId) {
        this.keyId = keyId;
    }

    public int getId() {
        return keyId;
    }

    public void toggle(final boolean pressed) {
        if (pressed != this.pressed) {
            this.pressed = pressed;
        }
        if (pressed) {
            presses++;
        }
    }

    public void tick() {
        if (absorbs < presses) {
            absorbs++;
            clicked = true;
        } else {
            clicked = false;
        }
    }

    public void release() {
        pressed = false;
    }
}
