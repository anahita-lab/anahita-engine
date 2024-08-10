package tech.siloxa.anahita.engine;

import tech.siloxa.anahita.grapichs.Screen;

import java.util.Stack;

public final class ScreenManager {

    private final Stack<Screen> screens = new Stack<>();

    public ScreenManager(Screen starterScreen) {
        screens.push(starterScreen);
    }

    public Screen currentScreen() {
        return screens.peek();
    }

    public Screen pop() {
        return screens.pop();
    }

    public void push(Screen screen) {
        screens.push(screen);
    }

    public Screen popAndPush(Screen screen) {
        final Screen popped = pop();
        push(screen);
        return popped;
    }
}
