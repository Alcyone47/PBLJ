import java.util.ArrayList;
import java.util.Collections;

public class FrequencyExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        Collections.sort(list);
        int currentElement = list.get(0);
        int currentFrequency = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == currentElement) {
                currentFrequency++;
            } else {
                System.out.println("Element " + currentElement + " has a frequency of " + currentFrequency);
                currentElement = list.get(i);
                currentFrequency = 1;
            }
        }
        System.out.println("Element " + currentElement + " has a frequency of " + currentFrequency);
    }
}