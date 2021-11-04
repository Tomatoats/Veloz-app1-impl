package baseline.functions;

import java.util.ArrayList;

public class List {
   ArrayList<Item> List = new ArrayList<>();


   private  void deleteItem(){
      //figure out which item needs to be deleted
      //and remove it from List with List.remove
      //check Size of list afterward, and if it is 0
      //send it to RemoveList.deleteList
   }
   public void SaveTheList(){
      /*
      Window stage = listController.stage();
      FileChooser fileChooser = new FileChooser();
      fileChooser.setInitialDirectory(new File("C:\\temp"));
      fileChooser.setTitle("Save Dialog");
      fileChooser.setInitialFileName("Lister");
      new FileChooser.ExtensionFilter("text file", "*.txt");
      try {
         File file = fileChooser.showSaveDialog(stage);
         fileChooser.setInitialDirectory(file.getParentFile());
      }
      catch (Exception ex)
      {

      }*/
      //once it get's where the file will be saved to
      //and after the user names it to whatever they want,
      //we will print to that .txt file, printing every String[]
      //saved in the array (except SaveThis), that's a key that we're done printing that arrayList
      //and we start printing out the next arraylist with SaveThis to the .txt
   }

   //TODO: Some newList function

   //TODO: Some NewItem function
   public Item getAt(int i){
      return List.get(i);
   }
   public String getDate(int i){
      Item tester = List.get(i);
      return tester.getDueDate();
   }
   public String getDescription(int i){
      Item tester = List.get(i);
      return tester.getDescription();
   }

   public void addItem(Item item){
      //add an item to list
      List.add(item);
   }

   private void showAll(){
      //display all items in the List
   }

   private void showComplete(){
      //comb through each item, only showing if item[3].equals "complete"

   }

   private void showIncomplete(){
      //comb through each item, only showing if item[3].equals "incomplete"
   }
   public void DeleteAllItems(){
      //remove all the stuff in the list
   }
   public void PrintWarning(String Warning){
      //it will pop up a new window
      //in which the warning will be displayed
      //to the user
   }
   public void setList(){

   }
   public  void getList(){

   }

}
