package tech.siloxa.anahita.engine;

import tech.siloxa.anahita.demo.DemoScreen;
import tech.siloxa.anahita.grapichs.Screen;

public final class ScreenManager {

    private final Screen currentScreen = new DemoScreen();

    public Screen currentScreen() {
        return currentScreen;
    }
}
