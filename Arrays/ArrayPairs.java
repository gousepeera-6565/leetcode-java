 

import java.util.Scanner;

public class ArrayPairs {

    // Method to print all possible pairs
    static void printAllPairs(int[] ar) {
        System.out.println("All possible pairs:");
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                System.out.println(ar[i] + " " + ar[j]);
            }
        }
    }
    // Method to print pairs whose sum equals k
    static void printPairsWithSum(int[] ar, int k) {
        System.out.println("Pairs with sum " + k + ":");
        boolean found = false;

        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] + ar[j] == k) {
                    System.out.println(ar[i] + " " + ar[j]);
                    found = true;
                }
            }
        }
    

        if (!found) {
            System.out.println("No pairs found");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scan.nextInt();

        int[] ar = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }

        System.out.print("Enter target sum (k): ");
        int k = scan.nextInt();

        printAllPairs(ar);
        printPairsWithSum(ar, k);
        

        scan.close();
    }
}
