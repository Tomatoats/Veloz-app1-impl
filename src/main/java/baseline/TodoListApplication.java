package baseline;


import baseline.functions.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution 1
 *  Copyright 2021 Alexys Veloz
 */

public class TodoListApplication extends javafx.application.Application {
    ObservableList<Item> currentList = FXCollections.observableArrayList();
     Map<String,Scene> scenemap = new HashMap<>();
     // set up lists and scenes


    public void start(Stage stage) throws Exception {
        addscenes();
        //there used to be a lot more scenes but I condensed
        Scene scene = scenemap.get("List");
        //set up the stage for the user to see
        stage.setTitle("List!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    public void addscenes() throws IOException {
        //create a map and add all fxml files to it
        Map<String,Scene> addmap = new HashMap<>();
        Parent add = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/List.fxml")));
        Scene toAdd = new Scene(add);
        addmap.put("List",toAdd);
        this.scenemap = addmap;
    }
    public ObservableList<Item> getCurrentList(){
        return currentList;
    }


    public Map<String, Scene> getScenemap(){
        return scenemap;
    }


}
