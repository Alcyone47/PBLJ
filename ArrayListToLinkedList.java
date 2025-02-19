//To convert using array list to linked list using java collection

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Apple");
    arrayList.add("Banana");
    arrayList.add("Cherry");
    System.out.println("ArrayList: " + arrayList);
    LinkedList<String> linkedList = new LinkedList<>(arrayList);
    System.out.println("LinkedList: " + linkedList);
  }
}