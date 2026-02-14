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

 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        // Convert to lowercase
        String lower = toLowerCase(input);
        System.out.println("Lowercase: " + lower);

        
    }
}
