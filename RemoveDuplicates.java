import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Grapes");
        System.out.println("Original List: " + list);
        removeDuplicates(list);
        System.out.println("List after removing duplicates: " + list);
    }
    public static void removeDuplicates(ArrayList<String> list) {
        Collections.sort(list);
        ArrayList<String> uniqueList = new ArrayList<>();
        for (String element : list) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }
        list.clear();
        list.addAll(uniqueList);
    }
}