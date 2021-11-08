package baseline.controllers;

import baseline.TodoListApplication;
import baseline.functions.Item;
import baseline.functions.List;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Callback;

import java.io.*;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Alexys Veloz
 */
public class ListController extends TodoListApplication implements  Initializable{
    FileChooser fileChooser = new FileChooser();
    public ObservableList<Item> list = FXCollections.observableArrayList();
    Item items = new Item("","");
    int k = 0;

    @FXML
    private Button removeButton;
    @FXML
    private Button addItemButton;

    @FXML
    private Button markComplete;
    @FXML
    private Button markIncomplete;

    @FXML
    private Button sortAll;
    @FXML
    private Button sortComplete;
    @FXML
    private Button sortIncomplete;


    @FXML
    public TextField descriptionText;
    @FXML
    public TextField dueDateText;
    @FXML
    public Label errorLabel;


    @FXML
    private Button clearButton;
    @FXML
    private Button loadButton;
    @FXML
    private Button saveButton;


    @FXML
    private TableView<Item> listTable;
    @FXML
    public TableColumn colComplete;
    @FXML
    public TableColumn colDescription;
    @FXML
    public TableColumn colDueDate;
    @FXML
    public CheckBox checkBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeTable();

    }
    @FXML
    void addPressed(ActionEvent event) {
        addItem();
    }
    @FXML
    void removePressed(ActionEvent event) {
        removeItem();
    }

    @FXML
    void allPress(ActionEvent event) {
        allList();
    }

    @FXML
    void completePress(ActionEvent event) {
       completeLists();
    }

    @FXML
    void incompletePress(ActionEvent event) {
        incompleteLists();
    }

    @FXML
    void clearPressed(ActionEvent event) {
        clearList();
        allList();
    }

    @FXML
    void loadPressed(ActionEvent event) throws IOException {
        listload();
    }
    @FXML
    void completeItemPressed(ActionEvent event) {
        findAndComplete();
    }
    @FXML
    void incompleteItemPressed(ActionEvent event) {
        findAndIncomplete();
    }


    @FXML
    void saveList(ActionEvent event) {
        findAndSave();
    }

    public void removeItem(){
        //find the item in the table and remove it
        listTable.getItems().removeAll(listTable.getSelectionModel().getSelectedItem());
    }

    public void findAndSave(){
        Window stage = saveButton.getScene().getWindow();
        //open up filechooser and set up for a txt file to be saved
        fileChooser.setTitle("Save Dialog");
        fileChooser.setInitialFileName("Lister");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text file", "*.txt"));
        try {
            File file = fileChooser.showSaveDialog(stage);
            fileChooser.setInitialDirectory(file.getParentFile());
            save(file);
        }
        catch (Exception ignored){}


    }
    public void incompleteLists(){
        //find all the items with getComplete = false, put it into a new List, show that list
        ObservableList<Item> incompleteList = FXCollections.observableArrayList();
        for (Item item : list) {
            if (item.getComplete() == false) {
                incompleteList.add(item);
            }
        }
        listTable.setItems(incompleteList);
    }
    public void completeLists(){
        //find all the items with getComplete = true, put it into a new List, show that list
        ObservableList<Item> completeList = FXCollections.observableArrayList();
        for (Item item : list) {
            if (item.getComplete() == true) {
                completeList.add(item);
            }
        }
        listTable.setItems(completeList);
    }
    public void allList(){
        listTable.setItems(list);
    }
    public void addItem(){
        //if the duedate and description texts check out, add it Item. Else, give an Error message
        if (!Boolean.TRUE.equals(Boolean.TRUE.equals(items.dueDateRegex(dueDateText.getText()))) || !items.descriptionLength(descriptionText.getText())) {
            errorLabel.setText("Description must be within 1-256 characters and Due Date should be in YYYY-MM-DD Format.");
        } else {
            errorLabel.setText("");
            list.add(new Item (dueDateText.getText(), descriptionText.getText()));
            k++;
            dueDateText.clear();
            descriptionText.clear();
        }
    }

    public Item getItem(){
        return items;
    }

    public void setListTable(TableView<Item> listTable) {
        this.listTable = listTable;
    }

    public TableView<List> getListTable() {
        return new TableView<>();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void setList(ObservableList<Item> list){
        this.list = list;
    }

    public void clearList(){
        list.remove(0,list.size());
        //listTable.setItems(list);
    }

    @FXML
    public void initializeTable(){
        //Set up the three columns, letting two of them being editable
        // and the complete one being kinda there
        listTable.setEditable(true);
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        colDescription.setCellFactory(TextFieldTableCell.forTableColumn());
        colDescription.setOnEditCommit((EventHandler<TableColumn.CellEditEvent>) event -> {
                    if (items.descriptionLength(String.valueOf(event.getNewValue())) == true) {
                        ((Item) event.getTableView().getItems().get(event.getTablePosition().getRow())).setDescription(String.valueOf(event.getNewValue()));
                        errorLabel.setText("");
                    } else {
                        errorLabel.setText("Description must be within 1-256 characters");
                    }
                }
        );

        colDueDate.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        colDueDate.setCellFactory(TextFieldTableCell.forTableColumn());
        colDueDate.setOnEditCommit((EventHandler<TableColumn.CellEditEvent>) event -> {
                    if (Boolean.FALSE.equals(items.dueDateRegex(String.valueOf(event.getNewValue())))) {
                        errorLabel.setText("Due Date must either be empty or in the format YYYY-MM-DD");
                    } else {
                        ((Item) event.getTableView().getItems().get(event.getTablePosition().getRow())).setDueDate(String.valueOf((event.getNewValue())));
                        errorLabel.setText("");
                    }
                }
        );

        colComplete.setCellValueFactory(new PropertyValueFactory<>("complete"));
        //colComplete.setCellFactory(TextFieldTableCell.forTableColumn());




        //colComplete.setCellFactory(column -> new CheckBoxTableCell<>());

        listTable.setItems(list);
    }

    public void listload() {
        Window originalstage = errorLabel.getScene().getWindow();
        // load up the filechooser and look for only text files
        fileChooser.setTitle("Load Dialog");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text file", "*.txt"));
        File file = fileChooser.showOpenDialog(originalstage);
        fileChooser.setInitialDirectory(file.getParentFile());

        try (Scanner input = new Scanner(Paths.get(String.valueOf(file))).useDelimiter("\n"))
        {
            //make sure the list is empty then scan in all the strings, parsing them correctly
            clearList();
            //also use a while to make sure it continues after the delimiter
            while (input.hasNext()) {
                Item items = new Item("", "");
                String str = input.next();
                String[] ArrayofString = str.split(",", 3);
                items.setDescription(ArrayofString[0]);
                items.setDueDate(ArrayofString[1]);
                items.whatComplete(ArrayofString[2]);
                list.add(items);
            }
            errorLabel.setText("");
        }
        catch (ArrayIndexOutOfBoundsException | IOException arrayIndexOutOfBoundsException) {
            errorLabel.setText("Either the file was corrupted or not in Lister format.");

        }
}

    void save(File file) throws IOException {
        try {
            //write down the entire list into a file
            FileWriter fileWriter = null;

            fileWriter = new FileWriter(file);
            for (int i = 0; i < list.size();i++) {
                fileWriter.write(list.get(i).getDescription() + ",");
                fileWriter.write( list.get(i).getDueDate() + ",");
                fileWriter.write(list.get(i).getComplete()+"\n");

            }
            fileWriter.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void closeAndOpen(String fxmlname, String stageTitle) throws IOException {
        //find the scene you want via the string names and open it
        close();
        addscenes();
        Map<String, Scene> theScenemap = getScenemap();
        Scene scene = theScenemap.get(fxmlname);
        Stage stage = new Stage();
        stage.setTitle(stageTitle);
        stage.setScene(scene);
        stage.show();
    }

    public void close(){
        Stage stage = (Stage) saveButton.getScene().getWindow();
        stage.close();
    }
    public void findAndComplete(){
        //find the item that the user wants to set to complete, and make it true
        list.get(listTable.getItems().indexOf(listTable.getSelectionModel().getSelectedItem())).setComplete(true);
        initializeTable();
    }
    public void findAndIncomplete(){
        //find the item that the user wants to set to incomplete, and make it false
        list.get(listTable.getItems().indexOf(listTable.getSelectionModel().getSelectedItem())).setComplete(false);
        initializeTable();
    }

}