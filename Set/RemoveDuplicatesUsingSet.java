package gousepeera;

import java.util.*;

public class _RemoveDuplicatesUsingSet {

    // Method to remove duplicate characters from a string
    public static void removeStringDuplicates(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        System.out.print("String after removing duplicates: ");
        for (char ch : set) {
            System.out.print(ch);
        }
        System.out.println();
    }

     
    // Method to remove duplicate elements from an array
    public static void removeArrayDuplicates(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.print("Array after removing duplicates (sorted): ");
        for (int x : set) {
            System.out.print(x + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input for String
        System.out.println("Enter a string:");
        String s = scan.nextLine();
        removeStringDuplicates(s);

        // Input for Array
        System.out.println("Enter array size:");
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
 removeArrayDuplicates(arr);

        
    }
}
