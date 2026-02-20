package gousepeera;

import java.util.*;
import java.util.Map.Entry;

/**
 * Day29 Program
 * Topics Covered:
 * 1. LinkedHashMap operations
 * 2. HashMap character counting
 * 3. Iterating using keySet() and entrySet()
 */
public class HashMap  {

    /**
     * Method to count frequency of each character in a string
     * @param s Input String
     */
    public static void countChar(String s) {

        // HashMap to store character and its count
        HashMap<Character, Integer> map = new HashMap<>();

        // Loop through each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If character already exists, increase count
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } 
            // Otherwise add character with count 1
            else {
                map.put(c, 1);
            }
        }

        // Display character counts
        System.out.println("\nCharacter Frequency:");
        for (Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        // LinkedHashMap maintains insertion order
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Sample string for character count
        String s = "gousepeera";

        // Adding elements to LinkedHashMap
        map.put("gouse", 54545);
        map.put("giri", 54545);
        map.put("ksgfjdfsd", 754968);

        // Display original map
        System.out.println("Original Map:");
        System.out.println(map);

        // Remove an element
        map.remove("gouse");

        System.out.println("\nAfter Removing 'gouse':");
        System.out.println(map);

        // Iteration using keySet()
        System.out.println("\nUsing keySet():");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            int value = map.get(key);
            System.out.println(key + " : " + value);
        }
   // Iteration using entrySet()
        System.out.println("\nUsing entrySet():");
        Set<Entry<String, Integer>> entries = map.entrySet();
        for (Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Call character counting method
        countChar(s);
        
    }
}
