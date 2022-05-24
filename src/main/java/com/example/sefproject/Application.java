package com.example.sefproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("login.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 1200, 800);
        scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
        Image icon = new Image(getClass().getResourceAsStream("Images/feather.png"));
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.setTitle("Paper&Quill");
        stage.setScene(scene);
        stage.show();
        root.requestFocus();
    }
    
    public static void main(String[] args) {
        launch();
    }
}