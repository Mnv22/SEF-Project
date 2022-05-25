package com.example.sefproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class classDesc {

    @FXML
    private ImageView IV;

    @FXML
    private Label subtitle;

    @FXML
    private Label desc;

    @FXML
    private Button link;

    @FXML
    private ImageView rightArrow;

    @FXML
    private ImageView leftArrow;

    private int current = 0;
    private String[] classes = new String[] {
            "Barbarian","Bard","Cleric"
            ,"Druid","Fighter","Monk",
            "Paladin","Ranger","Rogue",
            "Sorcerer","Warlock","Wizard"};

    Character you = new Character();

    public void continueChar(Character old) {
        you.Race = old.Race;
    }

    public void start(String text) throws IOException {
        while (!text.equals(classes[current])) {
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
        if(now == 11) {
            rightArrow.setId("hidden");
        }

        subtitle.setText(classes[now]);
        Image image = new Image(getClass().getResourceAsStream("Images/"+ classes[now]+".png"));
        String text = "";
        desc.setText(read(text,"src/main/resources/com/example/sefproject/classDescription/"+ classes[now]+".txt"));
        IV.setImage(image);
    }

    public void switchtoClassCar(ActionEvent event) throws IOException {
        SceneSwitcher switcher = new SceneSwitcher();
        switcher.switchScene("classCar.fxml",event);
    }

    public void switchtoStats(ActionEvent event) throws IOException {
        you.Class = current;
        SceneSwitcher switcher = new SceneSwitcher();
        switcher.WswitchScene("Stats.fxml",event,you);
    }



}
