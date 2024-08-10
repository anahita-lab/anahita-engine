package tech.siloxa.anahita.grapichs;

import tech.siloxa.anahita.io.InputController;

import java.awt.*;

public interface Screen {

    InputController input();

    void render(Graphics2D graphics);
}
