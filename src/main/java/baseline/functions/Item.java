package baseline.functions;

import javafx.beans.value.ObservableValue;
import javafx.util.Callback;
/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Alexys Veloz
 */

public class Item {
    String dueDate;
    String description;
    public boolean complete;
    //set these up for later

    public Item(String dd, String desc){
        this.dueDate = dd;
        this.description = desc;
        this.complete = false;
        //items is how we hold all our stuff  so this is important
    }

    public String getDueDate(){
        return dueDate;
    }
    public String getDescription(){
        return description;
    }
    //standard getters / setters


    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    public void whatComplete (String string){
        //if a string = true, turn the boolean true, else it stays false
        if (string.equals("true")){
            this.complete = true;
            setComplete(complete);
        }
        else{
            this.complete = false;
        }

    }


    public boolean getComplete() {
        return complete;
    }
    //standard getters / setters

    public void setDueDate(String string){
        this.dueDate = string;
    }
    public void setDescription(String string){
        this.description = string;
    }



    public Boolean dueDateRegex(String dueDate) {
        //if the duedate isn't in the form we want, reject it
        if (dueDate.matches("([0-9]{4})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])") || dueDate.isEmpty()) {
            setDueDate(dueDate);
            return true;
        } else {
            return false;
        }
    }
    public boolean descriptionLength(String description){
        //if description is empty or too long, reject it
        if (description.length() > 0 && description.length() < 257)
        {
            setDescription(description);
            return  true;
        }
        else
        {
            return false;
        }
    }
}
