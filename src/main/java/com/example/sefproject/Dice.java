package com.example.sefproject;

import javafx.fxml.FXML;

import javafx.scene.control.Label;

import javafx.event.ActionEvent;

import java.io.IOException;

import java.util.Random;

public class Dice {

    @FXML
    private Label r1d20;
    @FXML
    private Label r2d20;
    @FXML
    private Label r3d20;
    @FXML
    private Label r4d20;
    @FXML
    private Label r5d20;
    @FXML
    private Label r6d20;

    @FXML
    private Label r1d12;
    @FXML
    private Label r2d12;
    @FXML
    private Label r3d12;
    @FXML
    private Label r4d12;
    @FXML
    private Label r5d12;
    @FXML
    private Label r6d12;

    @FXML
    private Label r1d10;
    @FXML
    private Label r2d10;
    @FXML
    private Label r3d10;
    @FXML
    private Label r4d10;
    @FXML
    private Label r5d10;
    @FXML
    private Label r6d10;

    @FXML
    private Label r1d8;
    @FXML
    private Label r2d8;
    @FXML
    private Label r3d8;
    @FXML
    private Label r4d8;
    @FXML
    private Label r5d8;
    @FXML
    private Label r6d8;

    @FXML
    private Label r1d6;
    @FXML
    private Label r2d6;
    @FXML
    private Label r3d6;
    @FXML
    private Label r4d6;
    @FXML
    private Label r5d6;
    @FXML
    private Label r6d6;

    @FXML
    private Label r1d4;
    @FXML
    private Label r2d4;
    @FXML
    private Label r3d4;
    @FXML
    private Label r4d4;
    @FXML
    private Label r5d4;
    @FXML
    private Label r6d4;


    public void roll1d20(ActionEvent event) throws IOException {
        Random rand = new Random();
        r1d20.setText(Integer.toString(rand.nextInt(1, 20)));
    }
    public void roll2d20(ActionEvent event) throws IOException {
        Random rand = new Random();
        r2d20.setText(Integer.toString(rand.nextInt(1, 20)));
    }
    public void roll3d20(ActionEvent event) throws IOException {
        Random rand = new Random();
        r3d20.setText(Integer.toString(rand.nextInt(1, 20)));
    }
    public void roll4d20(ActionEvent event) throws IOException {
        Random rand = new Random();
        r4d20.setText(Integer.toString(rand.nextInt(1, 20)));
    }
    public void roll5d20(ActionEvent event) throws IOException {
        Random rand = new Random();
        r5d20.setText(Integer.toString(rand.nextInt(1, 20)));
    }
    public void roll6d20(ActionEvent event) throws IOException {
        Random rand = new Random();
        r6d20.setText(Integer.toString(rand.nextInt(1, 20)));
    }


    public void roll1d12(ActionEvent event) throws IOException {
        Random rand = new Random();
        r1d12.setText(Integer.toString(rand.nextInt(1, 12)));
    }
    public void roll2d12(ActionEvent event) throws IOException {
        Random rand = new Random();
        r2d12.setText(Integer.toString(rand.nextInt(1, 12)));
    }
    public void roll3d12(ActionEvent event) throws IOException {
        Random rand = new Random();
        r3d12.setText(Integer.toString(rand.nextInt(1, 12)));
    }
    public void roll4d12(ActionEvent event) throws IOException {
        Random rand = new Random();
        r4d12.setText(Integer.toString(rand.nextInt(1, 12)));
    }
    public void roll5d12(ActionEvent event) throws IOException {
        Random rand = new Random();
        r5d12.setText(Integer.toString(rand.nextInt(1, 12)));
    }
    public void roll6d12(ActionEvent event) throws IOException {
        Random rand = new Random();
        r6d12.setText(Integer.toString(rand.nextInt(1, 12)));
    }


    public void roll1d10(ActionEvent event) throws IOException {
        Random rand = new Random();
        r1d10.setText(Integer.toString(rand.nextInt(1, 10)));
    }
    public void roll2d10(ActionEvent event) throws IOException {
        Random rand = new Random();
        r2d10.setText(Integer.toString(rand.nextInt(1, 10)));
    }
    public void roll3d10(ActionEvent event) throws IOException {
        Random rand = new Random();
        r3d10.setText(Integer.toString(rand.nextInt(1, 10)));
    }
    public void roll4d10(ActionEvent event) throws IOException {
        Random rand = new Random();
        r4d10.setText(Integer.toString(rand.nextInt(1, 10)));
    }
    public void roll5d10(ActionEvent event) throws IOException {
        Random rand = new Random();
        r5d10.setText(Integer.toString(rand.nextInt(1, 10)));
    }
    public void roll6d10(ActionEvent event) throws IOException {
        Random rand = new Random();
        r6d10.setText(Integer.toString(rand.nextInt(1, 10)));
    }

    public void roll1d8(ActionEvent event) throws IOException {
        Random rand = new Random();
        r1d8.setText(Integer.toString(rand.nextInt(1, 8)));
    }
    public void roll2d8(ActionEvent event) throws IOException {
        Random rand = new Random();
        r2d8.setText(Integer.toString(rand.nextInt(1, 8)));
    }
    public void roll3d8(ActionEvent event) throws IOException {
        Random rand = new Random();
        r3d8.setText(Integer.toString(rand.nextInt(1, 8)));
    }
    public void roll4d8(ActionEvent event) throws IOException {
        Random rand = new Random();
        r4d8.setText(Integer.toString(rand.nextInt(1, 8)));
    }
    public void roll5d8(ActionEvent event) throws IOException {
        Random rand = new Random();
        r5d8.setText(Integer.toString(rand.nextInt(1, 8)));
    }
    public void roll6d8(ActionEvent event) throws IOException {
        Random rand = new Random();
        r6d8.setText(Integer.toString(rand.nextInt(1, 8)));
    }

    public void roll1d6(ActionEvent event) throws IOException {
        Random rand = new Random();
        r1d6.setText(Integer.toString(rand.nextInt(1, 6)));
    }
    public void roll2d6(ActionEvent event) throws IOException {
        Random rand = new Random();
        r2d6.setText(Integer.toString(rand.nextInt(1, 6)));
    }
    public void roll3d6(ActionEvent event) throws IOException {
        Random rand = new Random();
        r3d6.setText(Integer.toString(rand.nextInt(1, 6)));
    }
    public void roll4d6(ActionEvent event) throws IOException {
        Random rand = new Random();
        r4d6.setText(Integer.toString(rand.nextInt(1, 6)));
    }
    public void roll5d6(ActionEvent event) throws IOException {
        Random rand = new Random();
        r5d6.setText(Integer.toString(rand.nextInt(1, 6)));
    }
    public void roll6d6(ActionEvent event) throws IOException {
        Random rand = new Random();
        r6d6.setText(Integer.toString(rand.nextInt(1, 6)));
    }


    public void roll1d4(ActionEvent event) throws IOException {
        Random rand = new Random();
        r1d4.setText(Integer.toString(rand.nextInt(1, 4)));
    }
    public void roll2d4(ActionEvent event) throws IOException {
        Random rand = new Random();
        r2d4.setText(Integer.toString(rand.nextInt(1, 4)));
    }
    public void roll3d4(ActionEvent event) throws IOException {
        Random rand = new Random();
        r3d4.setText(Integer.toString(rand.nextInt(1, 4)));
    }
    public void roll4d4(ActionEvent event) throws IOException {
        Random rand = new Random();
        r4d4.setText(Integer.toString(rand.nextInt(1, 4)));
    }
    public void roll5d4(ActionEvent event) throws IOException {
        Random rand = new Random();
        r5d4.setText(Integer.toString(rand.nextInt(1, 4)));
    }
    public void roll6d4(ActionEvent event) throws IOException {
        Random rand = new Random();
        r6d4.setText(Integer.toString(rand.nextInt(1, 4)));
    }

}

