package baseline.controllers;

import baseline.TodoListApplication;
import baseline.functions.Item;
import baseline.functions.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

public class ListController extends TodoListApplication implements  Initializable{
    FileChooser fileChooser = new FileChooser();
    public   ObservableList<Item> list = FXCollections.observableArrayList();
    Item items = new Item("","");





    @FXML
    private Button AddItemButton;
    @FXML
    public TableColumn colComplete;

    @FXML
    public TableColumn colDescription;

    @FXML
    public TableColumn colDueDate;

    @FXML
    public TableColumn<Item, Button> colEditDate;

    @FXML
    public TableColumn<Item, Button> colEditDesc;

    @FXML
    public TableColumn<Item, Button> colRemove;

    @FXML
    private Button SortAll;
    @FXML
    private Label ErrorLabel;

    @FXML
    private TextField DescriptionText;
    @FXML
    private TextField DueDateText;

    @FXML
    private Button SortComplete;

    @FXML
    private Button SortIncomplete;


    @FXML
    public CheckBox CheckBox;

    @FXML
    private Button ClearButton;


    @FXML
    private Label DateLabel;

    @FXML
    private Label DescriptionLabel;

    @FXML
    private Button LoadButton;

    @FXML
    public Button RemoveItemButton;


    @FXML
    public Button editDateButton;

    @FXML
    public Button editDescButton;

    @FXML
    private TableView<Item> ListTable;

    @FXML
    private Button SaveButton;
    @FXML
    private Button NewListButton;

    @FXML
    void AddPressed(ActionEvent event) throws IOException {
        if (!Boolean.TRUE.equals(Boolean.TRUE.equals(items.DueDateRegex(DueDateText.getText()))) || !items.DescriptionLength(DescriptionText.getText())) {
            ErrorLabel.setText("Description must be within 1-256 characters and Due Date should be in YYYY-MM-DD Format.");
        } else {

            ErrorLabel.setText("");
            //items = getItem();
            list.add(new Item (DueDateText.getText(),DescriptionText.getText()));
            DueDateText.clear();
            DescriptionText.clear();


        }
    }

    public Item newItem(){

        items.setDueDate(DueDateText.getText());
        items.setDescription(DescriptionText.getText());
        items.setComplete(CheckBox);
        return items;
    }
    private void setUp(){


        items.getDescription();
        items.getDueDate();
        items.getComplete();

    }

    public void initializeTable(){

        colDescription.setCellValueFactory(new PropertyValueFactory<>("todoDescription"));
        colDueDate.setCellValueFactory(new PropertyValueFactory<>("duedate"));
        colComplete.setCellValueFactory(new PropertyValueFactory<>("complete"));
        //list.add(new Item("2021-01-01", "test"));
        ListTable.setItems(list);
    }


    @FXML
    void WarnNewList(ActionEvent event) throws IOException {
        closeAndOpen("WarningNew","Are you sure?");
    }

    @FXML
    void EditDueDate(ActionEvent event) throws IOException {
        closeAndOpen("EditDueDate","Due Date:");
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
    void saveList(ActionEvent event) {
        Window stage = SaveButton.getScene().getWindow();
        fileChooser.setTitle("Save Dialog");
        fileChooser.setInitialFileName("Lister");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text file", "*.txt"));
        try {
            File file = fileChooser.showSaveDialog(stage);
            fileChooser.setInitialDirectory(file.getParentFile());
        }
        catch (Exception ignored){}

    }

    public void close(){
        Stage stage = (Stage) SaveButton.getScene().getWindow();
        stage.close();
    }

    public void show(){
            DateLabel.setText(items.getDueDate());
            DescriptionLabel.setText(items.getDescription());
    }
    @FXML
    void allPress(ActionEvent event) {
        ListTable.setItems(list);
    }

    @FXML
    void completePress(ActionEvent event) {
        ObservableList<Item> completeList = FXCollections.observableArrayList();
        for(int i = 0; i < list.size();i++) {
            if (list.get(i).complete.isSelected()) {
                completeList.add(list.get(i));
            }
        }
        ListTable.setItems(completeList);
    }

    @FXML
    void incompletePress(ActionEvent event) {
        ObservableList<Item> incompleteList = FXCollections.observableArrayList();
        for(int i = 0; i < list.size();i++) {
            if (!list.get(i).complete.isSelected()) {
                incompleteList.add(list.get(i));
            }
        }
        ListTable.setItems(incompleteList);

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
    public Item getItem(){
        return items;
    }

    public void setListTable(TableView<Item> listTable) {
        this.ListTable = listTable;
    }

    public TableView<List> getListTable() {
        return new TableView<>();
    }

    @FXML
    void printList(ActionEvent event) {
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getDescription());
            System.out.println(list.get(i).getDueDate());
            System.out.println(list.size());
        }
    }
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        colDueDate.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        colComplete.setCellValueFactory(new PropertyValueFactory<>("complete"));
        //list.add(new Item("2021-01-01", "test"));
        ListTable.setItems(list);
    }

    public void SaveList(ActionEvent actionEvent) {
    }
}