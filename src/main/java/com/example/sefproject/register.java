package com.example.sefproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.HashMap;
import java.io.*;
import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import java.io.IOException;
public class register {

        final static String outputFilePath = "src/main/resources/com/example/sefproject/IDnPASS";

            @FXML
            private Button button;

            @FXML
            private Label wrongSignIN;   //for the case of used username

            @FXML
            private RadioButton DM;  // 0 or 1 either way

            @FXML
            private TextField newID;

            @FXML
            private PasswordField newPASS;


    public void userSignIn(ActionEvent event) throws IOException{
        Map<String, String> mapFromFile = ValidateLogin.HashMapFromTextFile();

        if(mapFromFile.containsKey(newID.getText().toString())){
            wrongSignIN.setText("The username is taken!");
        }
        else
            if(newID.getText().toString().length()>30){
                wrongSignIN.setText("The username is too long!");
            }
            else
                if(newPASS.getText().toString().length()>30){
                    wrongSignIN.setText("The Password is too long!");
                }
            else {
                    checkSignIn(event);
                    SceneSwitcher scene = new SceneSwitcher();
                    scene.switchScene("login.fxml",event);
            }

    }
    public void switchToRegister(ActionEvent event) throws IOException {
        SceneSwitcher scene = new SceneSwitcher();
        scene.switchScene("login.fxml",event);
    }
    private void checkSignIn(ActionEvent event)throws IOException {

        // create new HashMap
        HashMap<String, String> map = new HashMap<String, String>();

        // key-value pairs
        if(DM.isSelected())map.put(1+newID.getText().toString(), PasswordHashing.doHashing(newID.getText().toString()+newPASS.getText().toString()));
            else
        map.put(0+newID.getText().toString(), PasswordHashing.doHashing(newID.getText().toString()+newPASS.getText().toString()));

        // new file object
        File file = new File(outputFilePath);

        BufferedWriter bf = null;

        try {

            // create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(file,true));

            // iterate map entries
            for (Map.Entry<String, String> entry : map.entrySet()) {

                // put key and value separated by a colon
                bf.write(entry.getKey() + ":" + entry.getValue());

                // new line
                bf.newLine();
            }

            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {

                // always close the writer
                bf.close();
            } catch (Exception e) {
            }
        }
    }
    }


