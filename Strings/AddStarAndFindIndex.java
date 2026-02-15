package gousepeera;
import java.util.*;

public class AddStarAndFindIndex {

    // Add '*' before every occurrence of 'a'
    public static String addStarBeforeA(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                result = result + "*" + s.charAt(i);
            } else {
                result = result + s.charAt(i);
            }
        }
        return result;
    }
 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scan.nextLine();

        // Operation 1: Add star before 'a'
        String modified = addStarBeforeA(input);
        System.out.println("Modified String: " + modified);

         
    }
}
