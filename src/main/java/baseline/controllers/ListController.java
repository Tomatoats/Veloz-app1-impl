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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ListController extends TodoListApplication {
    FileChooser fileChooser = new FileChooser();
    List list;
    Item items = new Item();



    @FXML
    private Button AddItemButton;

    @FXML
    private CheckBox CheckBox;

    @FXML
    private Button ClearButton;

    @FXML
    private ComboBox<?> ComboBox;

    @FXML
    private Label DateLabel;

    @FXML
    private Label DescriptionLabel;

    @FXML
    private Button LoadButton;

    @FXML
    private Button RemoveItemButton;

    @FXML
    private ScrollBar Scroll;

    @FXML
    private Button editDateButton;

    @FXML
    private Button editDescButton;

    @FXML
    private Button SaveButton;
    @FXML
    private Button NewListButton;


    @FXML
    void WarnNewList(ActionEvent event) throws IOException {
        closeAndOpen("WarningNew","Are you sure?");
    }

    @FXML
    void EditDueDate(ActionEvent event) throws IOException {
        closeAndOpen("EditDueDate","Due Date:");
    }

    @FXML
    void OpenUpNewItem(ActionEvent event) throws IOException {
        closeAndOpen("AddItem","Make a New Item!");
    }

    @FXML
    void PopUpWarningClear(ActionEvent event) throws IOException {
        closeAndOpen("WarningClear","Are you sure?");
    }

    @FXML
    void PopUpWarningLoad(ActionEvent event) throws IOException {
        closeAndOpen("WarningLoad","Are you sure?");
       }

    @FXML
    void PopUpWarningRemove(ActionEvent event) throws IOException {
        closeAndOpen("WarningRemove","Are you sure?");
    }

    @FXML
    void editDescription(ActionEvent event) throws IOException {
        closeAndOpen("EditDescription","Description:");
    }
    @FXML
    void SaveList(ActionEvent event) {
        Window stage = SaveButton.getScene().getWindow();
        fileChooser.setTitle("Save Dialog");
        fileChooser.setInitialFileName("Lister");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text file", "*.txt"));
        try {
            File file = fileChooser.showSaveDialog(stage);
            fileChooser.setInitialDirectory(file.getParentFile());
        }
        catch (Exception ex)
        {

        }

    }
    public void close(){
        Stage stage = (Stage) ComboBox.getScene().getWindow();
        stage.close();
    }
    public void show(){
            DateLabel.setText(items.getDueDate());
            DescriptionLabel.setText(items.getDescription());
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