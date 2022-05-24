package com.example.sefproject;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class login {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToRace(ActionEvent event) throws IOException {
        SceneSwitcher scene = new SceneSwitcher();
        scene.switchScene("raceCar.fxml",event);
    }
}