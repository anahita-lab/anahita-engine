package tech.siloxa.anahita.grapichs;

import java.awt.*;
import java.awt.image.BufferedImage;

public class AnahitaGraphic implements Graphic {

    private BufferedImage bimg;
    private Graphics2D graphics;

    public AnahitaGraphic(Dimension dimension) {
        bimg = new BufferedImage(dimension.width, dimension.height, BufferedImage.TYPE_INT_ARGB);
        graphics = (Graphics2D) bimg.getGraphics();
    }

    public Graphics2D get2DGraphic() {
        return this.graphics;
    }

    public BufferedImage getBufferedImage() {
        return this.bimg;
    }
}
