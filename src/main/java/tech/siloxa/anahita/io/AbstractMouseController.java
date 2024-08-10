package tech.siloxa.anahita.io;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class AbstractMouseController implements MouseListener, MouseMotionListener {

    private int x = -1;
    private int y = -1;
    private Map<Integer, MouseButton> buttons;

    public abstract void input();

    protected void init(List<MouseButton> buttons) {
        this.buttons = buttons.stream()
                .map(button -> Map.entry(button.getId(), button))
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (k, v) -> k, LinkedHashMap::new
                        )
                );
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public void toggle(final int buttonId, final boolean pressed) {
        final MouseButton button = buttons.get(buttonId);
        if (button != null)
            button.toggle(pressed);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        toggle(e.getButton(), true);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        toggle(e.getButton(), false);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
