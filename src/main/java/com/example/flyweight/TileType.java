package com.example.flyweight;

import javafx.scene.image.Image;

public class TileType {
    private final String name;
    private final Image graphic;

    public TileType(String name, Image graphic) {
        this.name = name;
        this.graphic = graphic;
    }

    public String getName() {
        return name;
    }

    public Image getGraphic() {
        return graphic;
    }
}

