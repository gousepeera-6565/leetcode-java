package Dsa_Java;

import java.util.Scanner;

/**
 
 * Concept: Count trailing zeros in factorial (n!)
 * 
 * Trailing zeros in factorial come from factors of 10.
 * Since 10 = 2 × 5 and there are more 2s than 5s,
 * we count the number of factors of 5.
 */
public class TrailingZeros {

    // Method to count trailing zeros in n!
    public static int trailingZeros(int n) {
        int result = 0;

        // Count multiples of 5, 25, 125, etc.
        for (int power = 5; power <= n; power = power * 5) {
            result = result + (n / power);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
         System.out.print("Enter a number: ");
        int num = scan.nextInt();

        System.out.println("Trailing zeros in factorial: " + trailingZeros(num));
 
    }
}
