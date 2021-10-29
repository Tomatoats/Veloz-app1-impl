package baseline.functions;
/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution 1
 *  Copyright 2021 Alexys Veloz
 */

public class Mark {
    /* By default items aren't completed, but items can be completed via being checked.
    If items get clicked with CheckBox, it is complete. Otherwise, incomplete. Save this status
    so that Display can see what mark any item has.
     */
    String[] item;

    private void turnComplete(){
        //make item[3] = complete
    }

    private void turnIncomplete(){
        //make item[3] = incomplete
    }

    private String[] getItem(){
        return item;
    }
}
