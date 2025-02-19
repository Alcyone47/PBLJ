import java.util.*;
public class IntersectionUnion {

  public static void main(String[] args) {
    Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> setB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
    Set<Integer> union = union(setA, setB);
    System.out.println("Union of setA and setB: " + union);
    Set<Integer> intersection = intersection(setA, setB);
    System.out.println("Intersection of setA and setB: " + intersection);
  }
  public static Set<Integer> union(Set<Integer> setA, Set<Integer> setB) {
    Set<Integer> union = new HashSet<>(setA);
    union.addAll(setB);
    return union;
  }
  public static Set<Integer> intersection(Set<Integer> setA, Set<Integer> setB) {
    Set<Integer> intersection = new HashSet<>(setA);
    intersection.retainAll(setB);
    return intersection;
  }
}