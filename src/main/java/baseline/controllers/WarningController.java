package baseline.controllers;

import baseline.TodoListApplication;
import baseline.functions.Item;
import baseline.functions.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Map;

public class WarningController extends TodoListApplication {

    @FXML
    private Button BackButton;

    @FXML
    private Button ProceedButton;
    @FXML
    private Label WarningLabel;

    @FXML
    void GoBack(ActionEvent event) throws IOException {
        closeAndOpen("List", "List!");
    }

    @FXML
    void ContinueWith(ActionEvent event) {

    }
    public void close(){
        Stage stage = (Stage) BackButton.getScene().getWindow();
        stage.close();
    }
    public void closeAndOpen(String fxmlname, String stageTitle) throws IOException {
        close();
        Addscenes();
        Map theScenemap = getScenemap();
        Scene scene = (Scene) theScenemap.get(fxmlname);
        Stage stage = new Stage();
        stage.setTitle(stageTitle);
        stage.setScene(scene);
        stage.show();
    }




}




