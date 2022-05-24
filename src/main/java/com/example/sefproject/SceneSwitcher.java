package com.example.sefproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitcher {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchScene(String name, ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(name));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        root.requestFocus();
    }

    public void switchSceneWithInfo(String name, ActionEvent event,String info) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource(name));
        root = loader.load();

        raceDesc rd = loader.getController();
        rd.start(info);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        root.requestFocus();
    }

    public Stage getStage() {
        return stage;
    }
}
