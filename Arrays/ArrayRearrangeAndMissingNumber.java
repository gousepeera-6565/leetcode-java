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

     

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }


      int res= findMissing(arr);
      System.out.println(res);
        
        scan.close();
    }
}
