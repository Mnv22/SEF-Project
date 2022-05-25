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

    public void WswitchScene(String name, ActionEvent event, Character you) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource(name));
        root = loader.load();

        Stats rd = loader.getController();
        rd.continueChar(you);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        root.requestFocus();
    }

    public void CswitchScene(String name, ActionEvent event, Character you) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource(name));
        root = loader.load();

        Sheet rd = loader.getController();
        rd.continueChar(you);
        rd.write();

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        root.requestFocus();
    }

    public void UswitchScene(String name, ActionEvent event, Character you) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource(name));
        root = loader.load();

        classCar rd = loader.getController();
        rd.continueChar(you);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        root.requestFocus();
    }

    public void switchSceneForRace(String name, ActionEvent event, String info) throws IOException {

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

    public void switchSceneForClass(String name, ActionEvent event, String info, Character you) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource(name));
        root = loader.load();

        classDesc rd = loader.getController();
        rd.start(info);
        rd.continueChar(you);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        root.requestFocus();
    }
}
