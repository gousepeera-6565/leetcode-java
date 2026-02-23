package Dsa_Java;

import java.util.Scanner;

/**
 
 * Concept: Bit Manipulation
 * 1. Decimal to Binary Conversion
 * 2. Binary to Decimal Conversion
 */
public class BitManipulation {

    // Method to convert Decimal to Binary
    static String decimalToBinary(int n) {
        // Handle edge case when number is 0
        if (n == 0) {
            return "0";
        }

        String binary = "";

        while (n > 0) {
            int bit = n % 2;
            binary = bit + binary;
            n = n / 2;
        }

        return binary;
    }

       // Method to convert Binary to Decimal
    static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 1;

        // Traverse from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal = decimal + power;
            }
            power = power * 2;
        }

        return decimal;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = scan.nextInt();

        // Decimal to Binary
        String binary = decimalToBinary(n);
        System.out.println("Binary: " + binary);

       // Binary to Decimal
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal: " + decimal);

  
    }
}
