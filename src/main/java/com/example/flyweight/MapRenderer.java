package com.example.flyweight;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class MapRenderer {
    private static final int TILE_SIZE = 32;

    public static void renderMap(Canvas canvas, Tile[][] map) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                Tile tile = map[y][x];
                Image tileGraphic = TileGraphicFactory.getTileGraphic(tile.getType());
                gc.drawImage(tileGraphic, x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            }
        }
    }
}

