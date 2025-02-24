//Count the frequency of words appearing in a given string while ignoring the special characters. Ignore case sensitivity, remove punctuation, split the string into words based upon spaces

import java.util.*;

class WordFrequency {
  public static void main(String[] args) {
    String input = "Hello world! This is a string world, in Java";
    countWordFrequency(input);
  }
  public static void countWordFrequency(String input) {
    input = input.toLowerCase();
    input = input.replaceAll("[^a-zA-Z0-9\\s]", "");
    String[] words = input.split("\\s+");
    Map<String, Integer> wordFrequencies = new HashMap<>();
    for (String word : words) {
      if (wordFrequencies.containsKey(word)) {
        wordFrequencies.put(word, wordFrequencies.get(word) + 1);
      } else {
        wordFrequencies.put(word, 1);
      }
    }
    printWordFrequencies(wordFrequencies);
  }
  public static void printWordFrequencies(Map<String, Integer> wordFrequencies) {
    System.out.println("Word Frequencies:");
    for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}