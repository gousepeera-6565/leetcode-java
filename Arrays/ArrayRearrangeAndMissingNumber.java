package gousepeera;

import java.util.*;

public class Day16 {

    // Find missing number (array contains numbers from 1 to n)
    public static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }



     // Move all non -1 elements to the end and fill remaining with -1
    public static void rearrange(int[] arr) {
        int j = arr.length - 1;

        // Move non -1 elements to the end
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != -1) {
                arr[j] = arr[i];
                j--;
            }
        }

        // Fill remaining positions with -1
        while (j >= 0) {
            arr[j] = -1;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }


      int res= findMissing(arr);
      System.out.println(res);

      // Example usage
        rearrange(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }
}
