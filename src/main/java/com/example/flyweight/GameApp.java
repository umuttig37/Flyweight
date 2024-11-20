package com.example.flyweight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameApp extends Application {
    private static final int MAP_WIDTH = 20;
    private static final int MAP_HEIGHT = 15;
    private static final int TILE_SIZE = 32;

    @Override
    public void start(Stage primaryStage) {
        Tile[][] map = MapGenerator.generateMap(MAP_WIDTH, MAP_HEIGHT);
        Canvas canvas = new Canvas(MAP_WIDTH * TILE_SIZE, MAP_HEIGHT * TILE_SIZE);
        MapRenderer.renderMap(canvas, map);

        Pane root = new Pane(canvas);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("RPG Map");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
