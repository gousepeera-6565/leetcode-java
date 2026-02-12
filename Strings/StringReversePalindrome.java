 
/*
String Reverse & Palindrome Check

Problem:
1. Reverse a given string.
2. Check whether the string is a palindrome.

Palindrome:
A string is a palindrome if it reads the same forward and backward.

Example:
Input: madam
Output: Palindrome

Concepts Used:
- String traversal
- Two-pointer technique
- Time Complexity: O(n)
*/
import java.util.Scanner;

 

public class Day19_StringReversePalindrome {

    // Method to reverse a string
    public static String reverse(String s) {
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }

        return result;
    }

    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        // Reverse string
        String reversed = reverse(input);
        System.out.println("Reversed String: " + reversed);

         

         
    }
}
