package baseline.functions;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class List implements ObservableList<baseline.functions.List> {
      //ArrayList<Item> List = new ArrayList<>();
      ObservableList<Item> List = FXCollections.observableArrayList();


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

   @Override
   public void addListener(ListChangeListener<? super baseline.functions.List> listener) {

   }

   @Override
   public void removeListener(ListChangeListener<? super baseline.functions.List> listener) {

   }

   @Override
   public boolean addAll(baseline.functions.List... elements) {
      return false;
   }

   @Override
   public boolean setAll(baseline.functions.List... elements) {
      return false;
   }

   @Override
   public boolean setAll(Collection<? extends baseline.functions.List> col) {
      return false;
   }

   @Override
   public boolean removeAll(baseline.functions.List... elements) {
      return false;
   }

   @Override
   public boolean retainAll(baseline.functions.List... elements) {
      return false;
   }

   @Override
   public void remove(int from, int to) {

   }

   @Override
   public int size() {
      return 0;
   }

   @Override
   public boolean isEmpty() {
      return false;
   }

   @Override
   public boolean contains(Object o) {
      return false;
   }

   @Override
   public Iterator<baseline.functions.List> iterator() {
      return null;
   }

   @Override
   public Object[] toArray() {
      return new Object[0];
   }

   @Override
   public <T> T[] toArray(T[] a) {
      return null;
   }

   @Override
   public boolean add(baseline.functions.List list) {
      return false;
   }

   @Override
   public boolean remove(Object o) {
      return false;
   }

   @Override
   public boolean containsAll(Collection<?> c) {
      return false;
   }

   @Override
   public boolean addAll(Collection<? extends baseline.functions.List> c) {
      return false;
   }

   @Override
   public boolean addAll(int index, Collection<? extends baseline.functions.List> c) {
      return false;
   }

   @Override
   public boolean removeAll(Collection<?> c) {
      return false;
   }

   @Override
   public boolean retainAll(Collection<?> c) {
      return false;
   }

   @Override
   public void clear() {

   }

   @Override
   public baseline.functions.List get(int index) {
      return null;
   }

   @Override
   public baseline.functions.List set(int index, baseline.functions.List element) {
      return null;
   }

   @Override
   public void add(int index, baseline.functions.List element) {

   }

   @Override
   public baseline.functions.List remove(int index) {
      return null;
   }

   @Override
   public int indexOf(Object o) {
      return 0;
   }

   @Override
   public int lastIndexOf(Object o) {
      return 0;
   }

   @Override
   public ListIterator<baseline.functions.List> listIterator() {
      return null;
   }

   @Override
   public ListIterator<baseline.functions.List> listIterator(int index) {
      return null;
   }

   @Override
   public java.util.List<baseline.functions.List> subList(int fromIndex, int toIndex) {
      return null;
   }

   @Override
   public void addListener(InvalidationListener listener) {

   }

   @Override
   public void removeListener(InvalidationListener listener) {

   }
}
