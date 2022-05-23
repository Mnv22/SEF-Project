package com.example.sefproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class raceCar {

    private int current = 1;
    private String[] races = new String[] {
            "Dwarf","Elf","Halfling"
            ,"Human","Dragonborn","Gnome",
            "Half-Elf","Half-Orc","Tiefling" };

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

    public void rightArrow() {
        current++;
        switchCar(current);
    }

    public void leftArrow() {
        current--;
        switchCar(current);
    }

    public void switchCar(int now) {
        if (now == 1) {

            Image left = new Image(getClass().getResourceAsStream("Images/Dwarf.png"));
            ImageLeft.setImage(left);
            Image center = new Image(getClass().getResourceAsStream("Images/Elf.png"));
            ImageCenter.setImage(center);
            Image right = new Image(getClass().getResourceAsStream("Images/Halfling.png"));
            ImageRight.setImage(right);

            LabelLeft.setText(races[0]);
            LabelCenter.setText(races[1]);
            LabelRight.setText(races[2]);

            LeftButton.setId("hidden");
        }

        if (now == 2) {
            Image left = new Image(getClass().getResourceAsStream("Images/Human.png"));
            ImageLeft.setImage(left);
            Image center = new Image(getClass().getResourceAsStream("Images/Dragonborn.png"));
            ImageCenter.setImage(center);
            Image right = new Image(getClass().getResourceAsStream("Images/Gnome.png"));
            ImageRight.setImage(right);

            LabelLeft.setText(races[3]);
            LabelCenter.setText(races[4]);
            LabelRight.setText(races[5]);

            RightButton.setId("shown");
            LeftButton.setId("shown");
        }

        if (now == 3) {
            Image left = new Image(getClass().getResourceAsStream("Images/Half-Elf.png"));
            ImageLeft.setImage(left);
            Image center = new Image(getClass().getResourceAsStream("Images/Half-Orc.png"));
            ImageCenter.setImage(center);
            Image right = new Image(getClass().getResourceAsStream("Images/Tiefling.png"));
            ImageRight.setImage(right);

            LabelLeft.setText(races[6]);
            LabelCenter.setText(races[7]);
            LabelRight.setText(races[8]);

            RightButton.setId("hidden");
        }

    }

}
