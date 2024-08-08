package tech.siloxa.anahita.grapichs;

import java.util.List;

public final class Map {

    private List<List<Tile>> tiles;

    public static Map loadFile(String path) {
        return new Map();
    }

    public Map() {

    }

    public List<List<Tile>> getTiles() {
        return tiles;
    }

}
