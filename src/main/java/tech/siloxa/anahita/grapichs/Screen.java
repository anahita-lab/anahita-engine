package tech.siloxa.anahita.grapichs;

import java.awt.*;

public interface Screen {

    int x();

    int y();

    void render(Graphics2D graphics);
}
