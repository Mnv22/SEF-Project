package com.example.sefproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;


/*public class login {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToRace(ActionEvent event) throws IOException {
        SceneSwitcher scene = new SceneSwitcher();
        scene.switchScene("raceCar.fxml",event);
    }
}
*/

public class login {

    public login(){

    }

    @FXML
    private Button button;

    @FXML
    private Label wrongLogIN;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;


    public void userLogIn(ActionEvent event) throws IOException{
        checkLogIn(event);
    }

    private void checkLogIn(ActionEvent event)throws IOException{
        Application n= new Application();
        if(username.getText().toString().equals("nume")&&password.getText().toString().equals("parola")){
            wrongLogIN.setText("Succes");

            SceneSwitcher raceCar = new SceneSwitcher();
            raceCar.switchScene("raceCar.fxml",event);

        }

        else if(username.getText().isEmpty() && password.getText().isEmpty()){
            wrongLogIN.setText("Please type your username and password");
        }

        else{
            wrongLogIN.setText("Wrong username or password.");
        }

    }


}
