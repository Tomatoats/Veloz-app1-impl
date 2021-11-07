package baseline.controllers;



import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import baseline.TodoListApplication;
import baseline.functions.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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
    ListController lc = new ListController();
    ObservableList<Item> list = FXCollections.observableArrayList();


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
    void loadthelist(ActionEvent event) throws IOException {
            Window originalstage = Loadlist.getScene().getWindow();
            fileChooser.setTitle("Load Dialog");
            fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text file", "*.txt"));
        File file = fileChooser.showOpenDialog(originalstage);
        fileChooser.setInitialDirectory(file.getParentFile());
        if (file != null) {
                try (Scanner input = new Scanner(Paths.get(String.valueOf(file))).useDelimiter(",")) {
                    Item items = new Item("", "");
                    //also use a while to make sure it continues after the delimiter
                    int i = 0;
                    int k;
                    ArrayList<String[]> userinput = new ArrayList<>();
                    String[] user = new String[3];
                    while (input.hasNext()) {
                        k = i%3;

                        //while there is more to read
                        //put it into a arrayList
                        user[k] = input.next();
                        //items.setDueDate(input.nextLine());
                        //items.whatComplete(input.next(input.nextLine()));
                        if (k == 2){
                            items.setDescription(user[0]);
                            items.setDueDate(user[1]);
                            items.whatComplete(user[2]);
                            list.add(items);
                        }
                        i++;
                    }
                    lc.setList(list);

                    //send to save whatever the file is
                    closeAndOpen("List", "List!");
                } catch (Exception ex) {

                }
            }
        }






    public void openNewItem(ActionEvent actionEvent) throws IOException {
        closeAndOpen("List","List!");
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
    public  ObservableList getList() {
        return list;
    }

}
