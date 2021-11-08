package baseline.functions;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Alexys Veloz
 */

public class List implements ObservableList<baseline.functions.List> {
      ObservableList<Item> currentList = FXCollections.observableArrayList();

   //look I needed all these functions in order for the lsit to be observable in javafx.
   //id love to take away most of them but it yells at me if I take away even one




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
