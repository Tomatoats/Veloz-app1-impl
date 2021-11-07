package baseline.functions;

import javafx.scene.control.CheckBox;

public class Item {
    public String dueDate;
    public String description;
    CheckBox complete;


    public Item(String dd, String desc){
        this.dueDate = dd;
        this.description = desc;
        this.complete = new CheckBox();


    }

    public String getDueDate(){
        return dueDate;
    }
    public String getDescription(){
        return description;
    }



    public void setComplete(CheckBox complete) {
        this.complete = complete;
    }




    public CheckBox getComplete() {
        return complete;
    }



    public void turnComplete(){
    }
    public void turnIncomplete(){
    }
    public void editThisDueDate(){}
    public void editThisDescription(){}

    public void removethisItem(){}
    public void setDueDate(String string){
        this.dueDate = string;
    }
    public void setDescription(String string){
        this.description = string;
    }


    public Boolean DueDateRegex(String DueDate) {
        if (DueDate.matches("([0-9]{4})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])") || DueDate.isEmpty()) {
            setDueDate(DueDate);
            return true;
        } else {
            return false;
        }
    }
    public boolean DescriptionLength(String Description){
        if (Description.length() > 0 && Description.length() < 257)
        {
            setDescription(Description);
            return  true;
        }
        else
        {
            return false;
        }
    }
}
