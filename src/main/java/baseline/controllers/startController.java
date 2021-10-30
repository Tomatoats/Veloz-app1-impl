package baseline.controllers;



import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

public class startController implements Initializable {
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
                close();
                Parent root =  FXMLLoader.load(getClass().getResource("/List.fxml"));
                Scene scene = new Scene(root);
                Stage newstage = new Stage();
                newstage.setTitle("List!");
                newstage.setScene(scene);
                newstage.show();

            }
            catch (Exception ex)
            {

            }
        }

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


    public void openNewItem(ActionEvent actionEvent) throws IOException {
            close();
            Parent root =  FXMLLoader.load(getClass().getResource("/FirstItem.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Make a New Item!");
            stage.setScene(scene);
            stage.show();

    }
    public void close(){
            Stage stage = (Stage) newList.getScene().getWindow();
            stage.close();
    }

}
