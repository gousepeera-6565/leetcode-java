package Dsa_Java;

import java.util.Scanner;

/**

 * Concept: Binary Search
 * 1. Normal Binary Search
 * 2. Binary Search within a given range
 */
public class BinarySearch {

    // Standard Binary Search (entire array)
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key == arr[mid]) {
                return mid;
            } 
            else if (key < arr[mid]) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return -1; // Element not found
    }

  

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = scan.nextInt();

        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        scan.close();
    }
}
