  /*
 * Program: Space and Word Counter
 * Description:
 * 1. Count total spaces in a string
 * 2. Count total words based on spaces
 * 
 * Example:
 * Input: "Java is very powerful"
 * Spaces = 3
 * Words = 4
 */


import java.util.Scanner;

 
public class SpaceCounter {

    // Method to count total spaces
    public static int countSpaces(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

      // Method to count words (based on space separation)
    public static int countWords(String s) {
        if (s.trim().isEmpty()) {
            return 0;
        }

        int count = 1; // At least one word

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scan.nextLine();

        int spaceCount = countSpaces(input);
        int wordCount = countWords(input);

        System.out.println("Total Spaces: " + spaceCount);
         System.out.println("Total Words: " + wordCount);

        ;
    }
}
