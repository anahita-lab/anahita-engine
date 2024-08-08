package tech.siloxa.anahita.controller;

public class Key {

    private int eventId;
    public int presses;
    public int absorbs;
    public boolean down;
    public boolean clicked;

    public Key(int eventId) {
        this.eventId = eventId;
    }

    public int getEvent() {
        return eventId;
    }

    public void toggle(final boolean pressed) {
        if (pressed != down) {
            down = pressed;
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
        down = false;
    }
}
