package com.example.sefproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class raceDesc {

    @FXML
    private ImageView IV;

    @FXML
    private Label subtitle;

    @FXML
    private Label desc;

    @FXML
    private ImageView rightArrow;

    @FXML
    private ImageView leftArrow;

    private int current = 0;
    private String[] races = new String[] {
            "Dwarf","Elf","Halfling"
            ,"Human","Dragonborn","Gnome",
            "Half-Elf","Half-Orc","Tiefling" };

    public void start(String text) throws IOException {
        while (!text.equals(races[current])) {
            current++;
        }
        switchDesc(current);
    }

    public void goRight() throws IOException {
      current++;
      switchDesc(current);
    };

    public void goLeft() throws IOException {
        current--;
        switchDesc(current);
    };

    public String read(String text, String path) throws IOException{

        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            text = text + line;
        }

        return text;

    }

    public void switchDesc(int now) throws IOException {

        leftArrow.setId("shown");
        rightArrow.setId("shown");
        if (now == 0) {
            leftArrow.setId("hidden");
        }
        if(now == 8) {
            rightArrow.setId("hidden");
        }

        subtitle.setText(races[now]);
        Image image = new Image(getClass().getResourceAsStream("Images/"+races[now]+".png"));
        String text = "";
        desc.setText(read(text,"src/main/resources/com/example/sefproject/raceDescription/"+races[now]+".txt"));
        IV.setImage(image);
    }

    public void switchtoClassCar(ActionEvent event) throws IOException {

        Character you = new Character();
        you.Race = current;

        SceneSwitcher switcher = new SceneSwitcher();
        switcher.UswitchScene("classCar.fxml",event,you);
    }

    public void switchtoRaceCar(ActionEvent event) throws IOException {
        SceneSwitcher switcher = new SceneSwitcher();
        switcher.switchScene("raceCar.fxml",event);
    }

}
