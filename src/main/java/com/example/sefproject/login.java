package com.example.sefproject;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.Map;
public class login {

    @FXML
    private Label wrongLogIN;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;


    public void userLogIn(ActionEvent event) throws IOException{
        checkLogIn(event);
    }

    public void switchToRegister(ActionEvent event) throws IOException {
        SceneSwitcher scene = new SceneSwitcher();
        scene.switchScene("register.fxml",event);
    }

    private void checkLogIn(ActionEvent event)throws IOException{
       Application n = new Application();

        Map<String, String> mapFromFile = ValidateLogin.HashMapFromTextFile();

        if(mapFromFile.containsValue(PasswordHashing.doHashing(username.getText().toString() + password.getText().toString()))){
            wrongLogIN.setText("Succes");

            SceneSwitcher scene = new SceneSwitcher();
            scene.switchScene("raceCar.fxml",event);

        }

        else if(username.getText().isEmpty() && password.getText().isEmpty()){
            wrongLogIN.setText("Please type your username and password");
        }

        else{
            wrongLogIN.setText("Wrong username or password.");
        }

    }


}
