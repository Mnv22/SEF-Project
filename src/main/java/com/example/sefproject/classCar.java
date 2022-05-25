package com.example.sefproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class classCar {

    private int current = 0;
    private String[] classes = new String[] {
            "Barbarian","Bard","Cleric"
            ,"Druid","Fighter","Monk",
            "Paladin","Ranger","Rogue",
            "Sorcerer","Warlock","Wizard"};

    @FXML
    private ImageView ImageLeft;
    @FXML
    private ImageView ImageCenter;
    @FXML
    private ImageView ImageRight;
    @FXML
    private Button LabelLeft;
    @FXML
    private Button LabelCenter;
    @FXML
    private Button LabelRight;
    @FXML
    private ImageView RightButton;
    @FXML
    private ImageView LeftButton;
    @FXML
    private Button hiddenButton;

    Character you = new Character();

    public void continueChar(Character old) {
        you.Race = old.Race;
    }

    public void rightArrow() {
        current++;
        switchCar(current);
    }

    public void leftArrow() {
        current--;
        switchCar(current);
    }

    public void switchCar(int now) {
        RightButton.setId("shown");
        LeftButton.setId("shown");

        if (now == 0) {
            LeftButton.setId("hidden");
        }
        if (now == 3) {
            RightButton.setId("hidden");
        }

        Image left = new Image(getClass().getResourceAsStream("Images/"+ classes[now*3]+".png"));
        ImageLeft.setImage(left);
        Image center = new Image(getClass().getResourceAsStream("Images/"+ classes[now*3+1]+".png"));
        ImageCenter.setImage(center);
        Image right = new Image(getClass().getResourceAsStream("Images/"+ classes[now*3+2]+".png"));
        ImageRight.setImage(right);

        LabelLeft.setText(classes[now*3]);
        LabelCenter.setText(classes[now*3+1]);
        LabelRight.setText(classes[now*3+2]);

    }

    public void switchtoClassDesc(ActionEvent event) throws IOException {
        String title = ((Button)event.getSource()).getText();
        SceneSwitcher ClassDesc = new SceneSwitcher();
        ClassDesc.switchSceneForClass("ClassDesc.fxml",event,title,you);
    }
}
