 package gousepeera;
import java.util.*;

public class StringSplitCustom {

    // Method to split string without using built-in split()
    public static String[] split(String s) {
        int count = countWords(s);
        String[] arr = new String[count];

        String temp = "";
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp = temp + s.charAt(i);
            } else {
                if (!temp.equals("")) {
                    arr[index] = temp;
                    index++;
                    temp = "";
                }
            }
        }

        // Add last word
        if (!temp.equals("")) {
            arr[index] = temp;
        }

        return arr;
    }
  // Method to count number of words
    public static int countWords(String s) {
        int count = 0;
        boolean isWord = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (!isWord) {
                    count++;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }

        return count;
    }
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        String[] result = split(s);

        for (String word : result) {
            System.out.println(word);
        }

        scan.close();
    }
}
