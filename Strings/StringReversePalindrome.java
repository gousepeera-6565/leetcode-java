 
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


 // Method to check palindrome using two-pointer approach
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        // Reverse string
        String reversed = reverse(input);
        System.out.println("Reversed String: " + reversed);

           // Check palindrome
        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


         
    }
}
