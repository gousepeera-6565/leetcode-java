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

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String s2 = scan.next();
        int size = scan.nextInt();

      

        // System.out.println(checkSubsequence(s, s2));
         

        scan.close();
    }
}
