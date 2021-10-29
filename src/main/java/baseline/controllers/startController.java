package baseline.controllers;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class startController implements Initializable {
    /*
     *  UCF COP3330 Fall 2021 Application Assignment 1 Solution 1
     *  Copyright 2021 Alexys Veloz
     */

    @FXML
    private Label label;
    @FXML
    private Button shutup;
    @FXML
    private Button button;


        @Override
    public void initialize(URL url, ResourceBundle rb) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        label = new Label();
        label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
    }

    public void test(ActionEvent actionEvent) {
    }

    public void fuckYou(ActionEvent actionEvent) {
    }

    public void changeLabelText(ActionEvent actionEvent) {
    }
}
