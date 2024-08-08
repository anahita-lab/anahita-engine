package tech.siloxa.anahita.grapichs;

import java.util.Collection;

public abstract class DynamicScreen implements Screen {

    public abstract Map map();

    public void renderBoard() {
        map().getTiles()
                .stream()
                .flatMap(Collection::stream)
                .toList()
                .forEach(Tile::render);
    }
}
