package tech.siloxa.anahita.grapichs;

import tech.siloxa.anahita.controller.InputController;

import java.awt.*;

public interface Screen {

    void input(InputController controller);

    void render(Graphics2D graphics);
}
