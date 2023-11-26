package com.example.kolkoikrzyzyk;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController{
    @FXML
    private Label infoText;
    @FXML
    private Button resetButton;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private VBox tloStrony;
    @FXML
    private GridPane gridbox;

    private boolean kolej_gracza = true;

    private int[] tab1 = {0,0,0};
    private int[] tab2 = {0,0,0};
    private int[] tab3 = {0,0,0};

    @FXML
    protected void resetGame() {
        Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
        for (int i = 0; i < buttons.length; i++){
            Button button = buttons[i];
            button.setText("");
            button.setDisable(false);
        }
        infoText.setText("Kółko i krzyżyk");
        for (int i=0; i<3; i++)
        {
            tab1[i] = 0;
            tab2[i] = 0;
            tab3[i] = 0;

        }

    }
    @FXML
    public void przycisk1()
    {
        if(kolej_gracza)
        {
            button1.setText("O");
            button1.setDisable(true);
            kolej_gracza = false;
            tab1[0] = 1;
        }
        else{
            button1.setText("X");
            button1.setDisable(true);
            kolej_gracza = true;
            tab1[0] = 2;
        }
        winek();
    }
    @FXML
    public void przycisk2()
    {
        if(kolej_gracza)
        {
            button2.setText("O");
            button2.setDisable(true);
            kolej_gracza = false;
            tab1[1] = 1;
        }
        else{
            button2.setText("X");
            button2.setDisable(true);
            kolej_gracza = true;
            tab1[1] = 2;
        }
        winek();
    }
    @FXML
    public void przycisk3()
    {
        if(kolej_gracza)
        {
            button3.setText("O");
            button3.setDisable(true);
            kolej_gracza = false;
            tab1[2] = 1;
        }
        else{
            button3.setText("X");
            button3.setDisable(true);
            kolej_gracza = true;
            tab1[2] = 2;
        }
        winek();
    }
    @FXML
    public void przycisk4()
    {
        if(kolej_gracza)
        {
            button4.setText("O");
            button4.setDisable(true);
            kolej_gracza = false;
            tab2[0] = 1;
        }
        else{
            button4.setText("X");
            button4.setDisable(true);
            kolej_gracza = true;
            tab2[0] = 2;
        }
        winek();
    }
    @FXML
    public void przycisk5()
    {
        if(kolej_gracza)
        {
            button5.setText("O");
            button5.setDisable(true);
            kolej_gracza = false;
            tab2[1] = 1;
        }
        else{
            button5.setText("X");
            button5.setDisable(true);
            kolej_gracza = true;
            tab2[1] = 2;
        }
        winek();
    }
    @FXML
    public void przycisk6()
    {
        if(kolej_gracza)
        {
            button6.setText("O");
            button6.setDisable(true);
            kolej_gracza = false;
            tab2[2] = 1;
        }
        else{
            button6.setText("X");
            button6.setDisable(true);
            kolej_gracza = true;
            tab2[2] = 2;
        }
        winek();
    }
    @FXML
    public void przycisk7()
    {
        if(kolej_gracza)
        {
            button7.setText("O");
            button7.setDisable(true);
            kolej_gracza = false;
            tab3[0] = 1;
        }
        else{
            button7.setText("X");
            button7.setDisable(true);
            kolej_gracza = true;
            tab3[0] = 2;
        }
        winek();
    }
    @FXML
    public void przycisk8()
    {
        if(kolej_gracza)
        {
            button8.setText("O");
            button8.setDisable(true);
            kolej_gracza = false;
            tab3[1] = 1;
        }
        else{
            button8.setText("X");
            button8.setDisable(true);
            kolej_gracza = true;
            tab3[1] = 2;
        }
        winek();
    }
    @FXML
    public void przycisk9()
    {
        if(kolej_gracza)
        {
            button9.setText("O");
            button9.setDisable(true);
            kolej_gracza = false;
            tab3[2] = 1;
        }
        else{
            button9.setText("X");
            button9.setDisable(true);
            kolej_gracza = true;
            tab3[2] = 1;
        }
        winek();
    }
    public void winek()
    {
        if(tab1[0] == 1 && tab1[1] == 1 && tab1[2] == 1)
        {
            infoText.setText("O wygrało!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab2[0] == 1 && tab2[1] == 1 && tab2[2] == 1)
        {
            infoText.setText("O wygrało!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab3[0] == 1 && tab3[1] == 1 && tab3[2] == 1)
        {
            infoText.setText("O wygrało!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab1[0] == 1 && tab2[0] == 1 && tab3[0] == 1)
        {
            infoText.setText("O wygrało!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab1[1] == 1 && tab2[1] == 1 && tab3[1] == 1)
        {
            infoText.setText("O wygrało!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab1[2] == 1 && tab2[2] == 1 && tab3[2] == 1)
        {
            infoText.setText("O wygrało!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab1[0] == 1 && tab2[1] == 1 && tab3[2] == 1)
        {
            infoText.setText("O wygrało!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab1[2] == 1 && tab2[1] == 1 && tab3[0] == 1)
        {
            infoText.setText("O wygrało!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab1[0] == 2 && tab1[1] == 2 && tab1[2] == 2)
        {
            infoText.setText("X wygrał!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab2[0] == 2 && tab2[1] == 2 && tab2[2] == 2)
        {
            infoText.setText("X wygrał!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab3[0] == 2 && tab3[1] == 2 && tab3[2] == 2)
        {
            infoText.setText("X wygrał!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab1[0] == 2 && tab2[0] == 2 && tab3[0] == 2)
        {
            infoText.setText("X wygrał!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab1[1] == 2 && tab2[1] == 2 && tab3[1] == 2)
        {
            infoText.setText("X wygrał!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab1[2] == 2 && tab2[2] == 2 && tab3[2] == 2)
        {
            infoText.setText("X wygrał!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab1[0] == 2 && tab2[1] == 2 && tab3[2] == 2)
        {
            infoText.setText("X wygrał!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab1[2] == 2 && tab2[1] == 2 && tab3[0] == 2)
        {
            infoText.setText("X wygrał!");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }
        else if(tab1[0] != 0 && tab1[1] != 0 && tab1[2] != 0 && tab2[0] != 0 && tab2[1] != 0 && tab2[2] != 0 && tab3[0] != 0 && tab3[1] != 0 && tab3[2] != 0 )
        {
            infoText.setText("REMIS");
            Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
            for (int i = 0; i < buttons.length; i++){
                Button button = buttons[i];
                button.setDisable(true);
            }
        }

    }



}