package tech.siloxa.anahita.engine;

import tech.siloxa.anahita.demo.AnahitaScreen;
import tech.siloxa.anahita.grapichs.Screen;

public final class ScreenManager {

    public Screen currentScreen() {
        return new AnahitaScreen();
    }
}
