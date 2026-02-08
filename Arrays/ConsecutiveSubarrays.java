package gousepeera;
import java.util.*;

public class ConsecutiveSubarrays {

    // Print consecutive increasing subarrays
    public static void printConsecutiveSubarrays(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            System.out.print(arr[i] + " ");

            // If next element is not consecutive, start a new line
            if (arr[i + 1] - arr[i] != 1) {
                System.out.println();
            }
        }

        // Print last element
        System.out.println(arr[arr.length - 1]);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        printConsecutiveSubarrays(arr);

        scan.close();
    }
}
