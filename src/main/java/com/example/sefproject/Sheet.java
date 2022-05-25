package com.example.sefproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ResourceBundle;

public class Sheet implements Initializable {

    Character you = new Character();

    @FXML
    private ImageView IV;

    @FXML
    private Label name;

    @FXML
    private Label classy;

    @FXML
    private Label race;
    @FXML
    private Label strength;
    @FXML
    private Label dexterity;
    @FXML
    private Label constitution;
    @FXML
    private Label wisdom;
    @FXML
    private Label charisma;
    @FXML
    private Label intelligence;
    @FXML
    private Label temp;

    private String[] classes = new String[] {
            "Barbarian","Bard","Cleric"
            ,"Druid","Fighter","Monk",
            "Paladin","Ranger","Rogue",
            "Sorcerer","Warlock","Wizard"};
    private String[] races = new String[] {
            "Dwarf","Elf","Halfling"
            ,"Human","Dragonborn","Gnome",
            "Half-Elf","Half-Orc","Tiefling" };

    public void continueChar(Character old) {
        /*you.Dex = old.Dex;
        you.Stren = old.Stren;
        you.Wis = old.Wis;
        you.Cha = old.Cha;
        you.Int = old.Int;
        you.Con = old.Con;
        you.Race = old.Race;
        you.Class = old.Class;*/
        you = old;

    }

    public void write() {
        Image image = new Image(getClass().getResourceAsStream("Images/"+classes[you.Class]+".png"));
        String[] s = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        IV.setImage(image);
        name.setText(you.name);
        classy.setText(classes[you.Class]);
        race.setText(races[you.Race]);
        strength.setText(s[you.Stren]);
        dexterity.setText(s[you.Dex]);
        constitution.setText(s[you.Con]);
        wisdom.setText(s[you.Wis]);
        charisma.setText(s[you.Cha]);
        intelligence.setText(s[you.Int]);
        temp.setText(Integer.toString(you.Stren));
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void switchToDice(ActionEvent event) throws IOException {
        SceneSwitcher switcher = new SceneSwitcher();
        switcher.switchScene("Dice.fxml",event);
    }

}
