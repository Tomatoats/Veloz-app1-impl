package baseline.functions;
/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution 1
 *  Copyright 2021 Alexys Veloz
 */

public class NewItem {
    /* a new item will check is total items in that todolist is less than 256. Assuming it is less than that,
     it will bring up a new window, newItem.fxml where it will ask for a Title, Due date, and description.
    While description is optional, it will make sure it gets a title and due date and won't allow the user
    to make a new item until it gets those two, with due date being in proper format. THen it sends the
    user to List.fxml
     */

    String[] item;
    String title;
    String DueDate;
    String Description;

    private void setTitle(String userTitle){
        //get the title from user
        title = userTitle;
    }


    private void setDueDate(String userDueDate){
        //get the duedate from the user
        //assuming it's in the right form, else send an
        //error to the user
        // if due date does not match ((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01]) , don't take it
        DueDate = userDueDate;
    }

    private void setDescription(String UserDescription){
        //get the description from the user
        //if blank, leave blank
        Description = UserDescription;
    }

    private void setItem(){
        //set the item to everything else we got
        item = new String[4];
        item[0] = title;
        item[1] = DueDate;
        item[2] = Description;
        item[3] = "incomplete";
    }
}