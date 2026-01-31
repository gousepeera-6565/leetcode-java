package gousepeera;

import java.util.Scanner;

public class SumAndProductOfArray {

    // Method to calculate product of array elements
    static long product(int[] ar) {
        long p = 1;

        for (int i = 0; i < ar.length; i++) {
            p = p * ar[i];
        }
        return p;
    }
   // Method to calculate sum of array elements
    static int sum(int[] ar) {
        int s = 0;

        for (int i = 0; i < ar.length; i++) {
            s += ar[i];
        }
        return s;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();

        int[] ar = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }

        System.out.println("Sum of array elements: " + sum(ar));
        System.out.println("Product of array elements: " + product(ar));

        scan.close();
    }
}
