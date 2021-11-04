package baseline.controllers;



import java.io.File;
import java.io.IOException;
import java.util.Map;

import baseline.TodoListApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

public class startController extends TodoListApplication {
    /*
     *  UCF COP3330 Fall 2021 Application Assignment 1 Solution 1
     *  Copyright 2021 Alexys Veloz
     */
    FileChooser fileChooser = new FileChooser();


    @FXML
    private Label label;
    @FXML
    private Button shutup;
    @FXML
    private Button button;
    @FXML
    private Button newList;
    @FXML
    private Button Loadlist;

    @FXML
    void loadthelist(ActionEvent event) {
            Window originalstage = Loadlist.getScene().getWindow();
            fileChooser.setTitle("Load Dialog");
            fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text file", "*.txt"));
            try {
                File file = fileChooser.showOpenDialog(originalstage);
                fileChooser.setInitialDirectory(file.getParentFile());
                //send to save whatever the file is
                closeAndOpen("List","List!");
            }
            catch (Exception ex)
            {

            }
        }



    public void test(ActionEvent actionEvent) {
    }

    public void fuckYou(ActionEvent actionEvent) {
    }

    public void changeLabelText(ActionEvent actionEvent) {
    }


    public void openNewItem(ActionEvent actionEvent) throws IOException {
        closeAndOpen("FirstItem","Make A New Item!");
    }
    public void close(){
            Stage stage = (Stage) newList.getScene().getWindow();
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
