 
/*
 Longest Consecutive Subarray

Problem:
Find the longest subarray where the difference between consecutive elements is +1.

Example:
Input: 1 2 3 7 8 9 10
Output: 7 8 9 10

Concepts Used:
- Array traversal
- Index tracking
- Single pass algorithm
- Time Complexity: O(n)
*/
import java.util.Scanner;
 

public class Day18_LongestConsecutiveSubarray {

    // Method to print lengths of all consecutive subarrays
    public static void printSubarrayLengths(int[] arr) {
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                count++;
            } else {
                System.out.println("Length: " + count);
                count = 1;
            }
        }
        System.out.println("Length: " + count);
    }

  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        printSubarrayLengths(arr);   
     
 
    }
}
