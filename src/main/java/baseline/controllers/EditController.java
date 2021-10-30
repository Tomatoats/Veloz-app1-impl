package baseline.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class EditController {

    @FXML
    private Label EditLabelDueDesc;

    @FXML
    private Label ErrorLabel;

    @FXML
    private Button SubmitButton;
    @FXML
    private Button BackButton;

    @FXML
    void SubmitPressed(ActionEvent event) throws IOException {
        //make sure if whatever it was got verified. If it was Verified true, then open up list
        close();
        Parent root =  FXMLLoader.load(getClass().getResource("/List.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("List!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void goBack(ActionEvent event) throws IOException {
        close();
        Parent root =  FXMLLoader.load(getClass().getResource("/List.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("List!");
        stage.setScene(scene);
        stage.show();

    }
    public void close(){
        Stage stage = (Stage) SubmitButton.getScene().getWindow();
        stage.close();
    }
}
