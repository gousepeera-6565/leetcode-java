package gousepeera;

import java.util.Scanner;

public class PrimeNumbersInRange {

    // Method to check whether a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to print prime numbers in a given range
    public static void printPrimes(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int n1 = scan.nextInt();

        System.out.print("Enter end number: ");
        int n2 = scan.nextInt();

        printPrimes(n1, n2);
        scan.close();
    }
}
