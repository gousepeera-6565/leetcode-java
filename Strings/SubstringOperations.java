package gousepeera;
import java.util.*;

/* Substring Operations

This program performs multiple substring-related operations:

1. Check if one string is a subsequence of another
2. Print all substrings of a given size
3. Check if a substring exists in a string
4. Count occurrences of a substring

Concepts Used:
- String traversal
- Nested loops
- Basic pattern matching
*/

public class SubstringOperations {

    // Check if s2 is a subsequence of s
    public static String checkSubsequence(String s, String s2) {
        int i = 0, j = 0;

        while (i < s.length() && j < s2.length()) {
            if (s.charAt(i) == s2.charAt(j)) {
                j++;
            }
            i++;
        }

        return (j == s2.length()) ? "Yes" : "No";
    }
     // Print all substrings of given size
    public static void printSubstrings(String s, int size) {
        for (int i = 0; i <= s.length() - size; i++) {
            String temp = "";
            for (int j = i; j < i + size; j++) {
                temp = temp + s.charAt(j);
            }
            System.out.println(temp);
        }
    }

        // Check if s2 exists as substring in s
    public static String findSubstring(String s, String s2) {
        int size = s2.length();

        for (int i = 0; i <= s.length() - size; i++) {
            String temp = "";
            for (int j = i; j < i + size; j++) {
                temp = temp + s.charAt(j);
            }
            if (temp.equals(s2)) {
                return "Yes";
            }
        }
        return "No";
    }

    // Count occurrences of substring
    public static int countSubstring(String s, String s2) {
        int size = s2.length();
        int count = 0;

        for (int i = 0; i <= s.length() - size; i++) {
            String temp = "";
            for (int j = i; j < i + size; j++) {
                temp = temp + s.charAt(j);
            }
            if (temp.equals(s2)) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String s2 = scan.next();
        int size = scan.nextInt();

        // Example operations
        printSubstrings(s, size);

        // System.out.println(checkSubsequence(s, s2));
          // System.out.println(findSubstring(s, s2));  
           // System.out.println(countSubstring(s, s2));

        scan.close();
    }
}
