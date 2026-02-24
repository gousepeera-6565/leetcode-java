package Dsa_Java;

import java.util.Scanner;

/**
  
 * Concepts:
 * 1. GCD using Euclid Algorithm
 * 2. GCD using brute force method
 * 3. Prime number check
 */
public class GCD {

   

    // Brute Force GCD Method
    public static int gcd(int a, int b) {
        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    // Prime number check
    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scan.nextInt();

        System.out.print("Enter second number: ");
        int b = scan.nextInt();

        

        // GCD using brute force
        System.out.println("GCD (Brute Force): " + gcd(a, b));

        scan.close();
    }
}
