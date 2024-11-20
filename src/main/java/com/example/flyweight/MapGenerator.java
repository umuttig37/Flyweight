package com.example.flyweight;

public class MapGenerator {
    public static Tile[][] generateMap(int width, int height) {
        Tile[][] map = new Tile[height][width];
        String[] tileTypes = {"Grass", "Water", "Mountain"};
        String[] images = {"/path/to/grass.png", "/path/to/water.png", "/path/to/mountain.png"};

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Randomly pick a tile type
                int randomIndex = (int) (Math.random() * tileTypes.length);
                TileType type = TileTypeFactory.getTileType(tileTypes[randomIndex], images[randomIndex]);
                map[y][x] = new Tile(x, y, type);
            }
        }

        return map;
    }
}

