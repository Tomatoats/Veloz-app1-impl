package baseline.functions;

import java.util.ArrayList;
import java.util.List;
/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution 1
 *  Copyright 2021 Alexys Veloz
 */

public class Edit {
    /*This class is going to take in whatever text field is going to be edited, whether list name, title, due date, or
    or description. Depending on the item, some of them might have checks (due date has to be YYYY-MM-DD, title needs
    to be 3 characters long minimum, etc). Then return the new strings.
     */
    String ToEdit;
    ArrayList<String[]> List;
    String[] item;
    Verify verifier = new Verify();
    Error ErrorScren = new Error();



    private  void editDueDate(String ToEdit){
        if (verifier.DueDateRegex(ToEdit))
        {
            //take in this new due date
        }
        else
        {
            //error Screen: Due Date must be in the format:
            //YYYY-MM-DD
            ErrorScren.printError("YYYY-MM-DD  format for Due Dates.");
        }
    }

    private  void editDescription(String ToEdit){
        if (verifier.DescriptionLength(ToEdit))
        {
            //take in this new Description
        }
        else
        {
            //Error Screen: Description needs to be between 1 and 256 characters!
            ErrorScren.printError("Description needs to be between 1 and 256 characters!");
        }
    }

    private List<String[]> getArrayList(){
        //get the arrayList
        return List;
    }

    private String[] getItem(){
        //get the Item
        return item;
    }
    private void setToEdit(String input){
        //Set the string to whatever the user enters
        ToEdit = input;
    }
}
