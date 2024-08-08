package tech.siloxa.anahita.engine;

import tech.siloxa.anahita.grapichs.AnahitaScene;
import tech.siloxa.anahita.grapichs.Scene;

public final class GameStateManager {

    public Scene currentScene() {

        return new AnahitaScene();
    }
}
