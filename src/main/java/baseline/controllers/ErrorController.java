package baseline.controllers;

import baseline.TodoListApplication;
import baseline.functions.Item;
import baseline.functions.List;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Map;

public class ErrorController extends TodoListApplication {
    List currentList = new List();
    Item items = new Item();


    @FXML
    private Label ErrorLabel;

    public void SetError(String prompt) {
        ErrorLabel.setText(prompt);
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

    public void close() {
        Stage stage = (Stage) ErrorLabel.getScene().getWindow();
        stage.close();
    }
}