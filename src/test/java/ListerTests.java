import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution 1
 *  Copyright 2021 Alexys Veloz
 */

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ListerTests {
    //the tests do work they just take some literal time
    //i suspect its because of this "before each"
    //but the tests don't work at all if I do "beforeAll"
    //so please just be patient for the tests
    {
        //so I'm gonna have a List be an Arraylist of String[]
        //where an item is a String[4] for Title(String[0]), Due Date(String[1]), Description(String[2]),
        // and completed(String[3]) or not
        //the arrayList name is going to be in the first String[] we take in, the actual arrayList name will be a number
        //the String[] name is just going to be a number since technically each item doesn't neeeeed a title
        ArrayList<String[]> List1 = new ArrayList<>();
        String[] ListName = new String[1];
        ListName[0] = "School Projects";
        List1.add(ListName);

        String[] item1 = new String[4];
        item1[0] = "Birthday Party";
        item1[1] = "2021-11-11";
        item1[2] = "Make sure to buy dad's gift before hand! Address: 123 Sesame Street";
        item1[3] = "incomplete";
        List1.add(item1);

    }
    @Test
    void DesplayAll(){
        //in this one, once display all is clicked, we'll call
        //ShowAll() in class Display, where every item in that list is shown.
    }
    @Test
    void DesplayComplete(){
        //in this one, once display complete is clicked, we'll call
        //ShowComplete() in class Display, where every item in that list with it's third
        // element being "complete" is shown.
    }
    @Test
    void DesplayIncomplete(){
        //in this one, once display incomplete is clicked, we'll call
        //ShowIncomplete() in class Display, where every item in that list with it's third
        // element being "incomplete" is shown.
    }
    @Test
    void editTheListName(){
        //since the list name is always the first element of the arrayList, we call
        //it and change Listname[0].

    }

    @Test
    void editTheDueDate(){
        //We figure out which item they want to switch the name, call that specific
        //item in the arrayList, and then change whatever item that is by making it's
        //1st element to whatever string the user puts
        //if it doesn't fit the YYYY-MM-DD set, ask the user to try again.
    }
    @Test
    void editTheDescription(){
        //We figure out which item they want to switch the name, call that specific
        //item in the arrayList, and then change whatever item that is by making it's
        //2nd element to whatever string the user puts
    }
    @Test
    void LoadError(){
        //We try to load in a txt Lister file, and if it isn't in the
        //proper lister format, we send in an error. We purposely load in
        //a wrong file and make sure that we get an error

    }
    @Test
    void LoadingInFile(){
        //we try to take in a proper lister File, and I make sure that
        //we can extract the info from the file properly and have valid info
    }
    @Test
    void turnComplete(){
        //we find the item that got turned complete and turn it's 3rd element
        //string to "complete"
    }
    @Test
    void turnIncomplete(){
        //we find the item that got turned incomplete and turn it's 3rd element
        //string to "incomplete"
    }

    @Test
    void CheckSetDueDate(){
        //we have a string, we check to make sure it is in proper format,
        //and we set some item[1] to said string.
        //double check with an assert that it properly took it.

    }
    @Test
    void CheckSetDescription(){
        //we have a string, and we set some item[3] to said string,
        //double check with an assert that it properly took it
        //String can be empty in this one btw
    }

    @Test
    void DoesDeleteItemWork(){
        //we're gonna remove an item from the ArrayList, and double check it worked
        //by checking Arraylist Size.
    }
    @Test
    void DoesClearListWork(){
        //we call on the CLearList class and call it's deleteAll function.
    }
    @Test
    void DoesStartSceneWork(){
        //we call deleteList, and then make sure StartScene opens afterward so the user
        //can choose to load or start a new list.
    }
    @Test
    void GetStringsForWarning(){
        //we have warning have a string thats empty, and we set that string to
        //whatever String we get from another class, and then show that to the user.
        //make sure the warning matches what we actually want it to say.
    }
    @Test
    void checkGetArrayList(){
        //We make sure that when we use the getArrayList function, it properly gives
        //us the arrayList we need and we can get info from it.
    }
    @Test
    void checkGetItem(){
        //we make sure that when we use the getItem function, it porperly gives us
        //the Item we need and we can get info from it
    }






}
