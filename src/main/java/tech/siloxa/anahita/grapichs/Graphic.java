package tech.siloxa.anahita.grapichs;

import java.awt.*;
import java.awt.image.BufferedImage;

public interface Graphic {

    Graphics2D get2DGraphic();

    BufferedImage getBufferedImage();
}
