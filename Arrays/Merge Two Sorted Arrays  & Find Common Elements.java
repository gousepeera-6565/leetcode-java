 
import java.util.*;

public class Day13 {

    // Prints common elements from two sorted arrays
    public static void printCommonElements(int[] ar1, int[] ar2) {
        int i = 0, j = 0;

        System.out.print("Common elements: ");
        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] == ar2[j]) {
                System.out.print(ar1[i] + " ");
                i++;
                j++;
            } else if (ar1[i] > ar2[j]) {
                j++;
            } else {
                i++;
            }
        }
        System.out.println();
    }

  

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ar1 = new int[5];
        int[] ar2 = new int[5];

        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = scan.nextInt();
        }

        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = scan.nextInt();
        }

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        printCommonElements(ar1, ar2);

 
    }
}
