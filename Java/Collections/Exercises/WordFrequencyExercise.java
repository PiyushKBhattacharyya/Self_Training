package Collections.Exercises;

import java.util.HashMap;
import java.util.Map;

/*
 * Exercise: Word Frequency Counter
 * 
 * 1. Create a method that takes a String array of words.
 * 2. Return a Map<String, Integer> where the key is the word and value is the count.
 * 3. Test with input: {"apple", "banana", "apple", "cherry", "banana", "apple"}
 */

public class WordFrequencyExercise {
    
    public static Map<String, Integer> performFrequencyCount(String[] words) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        for (String word : words) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        String[] input = {"apple", "banana", "apple", "cherry", "banana", "apple"};
        
        Map<String, Integer> result = performFrequencyCount(input);
        
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
