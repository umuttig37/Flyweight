package com.example.flyweight;

import javafx.scene.image.Image;
import java.util.HashMap;
import java.util.Map;

public class TileTypeFactory {
    private static final Map<String, TileType> tileTypes = new HashMap<>();

    public static TileType getTileType(String name, String imagePath) {
        return tileTypes.computeIfAbsent(name, key -> new TileType(name, new Image(imagePath)));
    }
}

