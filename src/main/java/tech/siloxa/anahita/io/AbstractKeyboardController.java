package tech.siloxa.anahita.io;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class AbstractKeyboardController implements KeyListener {

    private Map<Integer, Key> keys;

    protected void init(List<Key> keys) {
        this.keys = keys.stream()
                .map(key -> Map.entry(key.getEvent(), key))
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (k, v) -> k, LinkedHashMap::new
                        )
                );
        System.out.println(this.keys.get(KeyEvent.VK_W));
    }

    public void releaseAll() {
        keys.values().forEach(Key::release);
    }

    public void tick() {
        keys.values().forEach(Key::tick);
    }

    public void toggle(final KeyEvent keyEvent, final boolean pressed) {
        final Key key = keys.get(keyEvent.getKeyCode());
        if(key != null)
            key.toggle(pressed);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        toggle(e, true);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        toggle(e, false);
    }
}