package gousepeera;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 
 * Concept: Count number of pairs in an array using HashMap
 * A pair is formed when two same elements are available.
 */
public class  CountPairs {

    // Method to count number of pairs
    public static int countPairs(int arr[]) {

        // HashMap to store element frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Calculate number of pairs
        int totalPairs = 0;

        for (int value : map.values()) {
            totalPairs = totalPairs + (value / 2);
        }

        return totalPairs;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Read array size
        System.out.print("Enter array size: ");
        int n = scan.nextInt();

        int arr[] = new int[n];

        // Read array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Call method
        int result = countPairs(arr);
        System.out.println("Total pairs: " + result);

        scan.close();
    }
}
