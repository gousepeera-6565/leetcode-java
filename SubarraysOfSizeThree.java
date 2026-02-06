
import java.util.Scanner;

public class Day15 {

    // Print all subarrays of size 3
    public static void printSubarrays(int[] arr) {
        for (int i = 0; i <= arr.length - 3; i++) {
            for (int j = i; j < i + 3; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Call required methods
        printSubarrays(arr);
         

        scan.close();
    }
}
