package baseline.functions;

import java.lang.reflect.Array;
import java.util.ArrayList;
/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution 1
 *  Copyright 2021 Alexys Veloz
 */

public class Save {
    /* This will ask the user what list(s) they want to save, and where they want it to be saved.
     it will add its changes to the txt and letting the user know that everything was saved to the txt file
     */
    //we don't need what list to save anymore since itll only be one so that's a change
    ArrayList<String[]> List;


    private void Save(){
        //once it get's where the file will be saved to
        //and after the user names it to whatever they want,
        //we will print to that .txt file, printing every String[]
        //saved in the array (except SaveThis), that's a key that we're done printing that arrayList
        //and we start printing out the next arraylist with SaveThis to the .txt
    }

    private ArrayList<String[]> getList(){
        return List;
    }
}
