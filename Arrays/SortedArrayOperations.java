
import java.util.*;

public class Day13 {

    // Prints common elements in two sorted arrays
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

    // Merge two sorted arrays into one sorted array
    public static int[] mergeSortedArrays(int[] ar1, int[] ar2) {
        int[] res = new int[ar1.length + ar2.length];
        int i = 0, j = 0, k = 0;

        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] <= ar2[j]) {
                res[k++] = ar1[i++];
            } else {
                res[k++] = ar2[j++];
            }
        }

        while (i < ar1.length) {
            res[k++] = ar1[i++];
        }

        while (j < ar2.length) {
            res[k++] = ar2[j++];
        }

        return res;
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

        // Sort arrays (important)
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        printCommonElements(ar1, ar2);
        int[] result = mergeSortedArrays(ar1, ar2);
        System.out.print("Merged sorted array: ");
        for (int val : result) {
            System.out.print(val + " ");
        }


         

        scan.close();
    }
}
