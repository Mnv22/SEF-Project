package com.example.sefproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;

public class Stats implements Initializable {

    @FXML
    private ChoiceBox<String> stren;
    @FXML
    private ChoiceBox<String> dex;
    @FXML
    private ChoiceBox<String> con;
    @FXML
    private ChoiceBox<String> intel;
    @FXML
    private ChoiceBox<String> wis;
    @FXML
    private ChoiceBox<String> cha;
    @FXML
    private TextField name;
    @FXML
    private Label wrong;
    ObservableList<String> stats = FXCollections.observableArrayList("15","14","13","12","10","8");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        stren.setItems(stats);
        stren.setValue("10");
        dex.setItems(stats);
        dex.setValue("10");
        con.setItems(stats);
        con.setValue("10");
        intel.setItems(stats);
        intel.setValue("10");
        wis.setItems(stats);
        wis.setValue("10");
        cha.setItems(stats);
        cha.setValue("10");
    }

    Character you = new Character();

    public void continueChar(Character old) {
        you.Race = old.Race;
        you.Class = old.Class;
    }

    public void switchtoSheet(ActionEvent event) throws IOException {
        wrong.setId("hidden");
        if (name.getText().isEmpty()) {
            wrong.setId("shown");
        }
        else {
            you.Stren = Integer.parseInt(stren.getValue());
            you.Con = Integer.parseInt(con.getValue());
            you.Wis = Integer.parseInt(wis.getValue());
            you.Int = Integer.parseInt(intel.getValue());
            you.Cha = Integer.parseInt(cha.getValue());
            you.Dex = Integer.parseInt(dex.getValue());
            you.name =  name.getText();

            /*PrintWriter writer = new PrintWriter(you.name+".txt", "UTF-8");
            writer.println(String.valueOf(you.Stren));
            writer.println(you.Con);
            writer.println(you.Wis);
            writer.println(you.Int);
            writer.println(you.Cha);
            writer.println(you.Dex);
            writer.println(you.name);
            writer.println(you.Race);
            writer.println(you.Class);
            writer.close();*/

            SceneSwitcher switcher = new SceneSwitcher();
            switcher.CswitchScene("Sheet.fxml",event,you);
        }
    }

}
