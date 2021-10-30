package baseline.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class WarningController {

    @FXML
    private Button BackButton;

    @FXML
    private Button ProceedButton;

    @FXML
    void GoBack(ActionEvent event) throws IOException {
        close();
        Parent root =  FXMLLoader.load(getClass().getResource("/List.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("List!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void ContinueWith(ActionEvent event) {

    }
    public void close(){
        Stage stage = (Stage) BackButton.getScene().getWindow();
        stage.close();
    }


}
