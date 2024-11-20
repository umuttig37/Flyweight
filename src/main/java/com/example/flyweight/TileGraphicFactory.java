package com.example.flyweight;

import javafx.scene.image.Image;
import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static final Map<String, Image> tileGraphics = new HashMap<>();

    public static Image getTileGraphic(String tileType) {
        return tileGraphics.computeIfAbsent(tileType, type -> {
            String imagePath = "/path/to/images/" + type + ".png";
            return new Image(imagePath);
        });
    }
}

