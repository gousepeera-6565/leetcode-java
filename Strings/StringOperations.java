package gousepeera;
import java.util.*;

public class StringOperations {

    // Method to convert uppercase letters to lowercase
    public static String toLowerCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
            } else {
                result = result + ch;
            }
        }
        return result;
    }

 // Method to remove leading and trailing spaces
    public static String removeExtraSpaces(String s) {
        int start = 0, end = s.length() - 1;

        // Find first non-space character
        while (start < s.length() && s.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space character
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + s.charAt(i);
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        // Convert to lowercase
        String lower = toLowerCase(input);
        System.out.println("Lowercase: " + lower);
         
        // Remove leading and trailing spaces
        String trimmed = removeExtraSpaces(input);
        System.out.println("After removing spaces: " + trimmed);
        
    }
}
