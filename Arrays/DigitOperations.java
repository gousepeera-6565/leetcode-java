package gousepeera;

import java.util.Scanner;

public class DigitOperations {

    // Method to calculate sum of digits
    static int sumOfDigits(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    // Method to reverse a number
    static int reverseNumber(int n) {
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        System.out.println("Sum of digits: " + sumOfDigits(n));
        System.out.println("Reverse of number: " + reverseNumber(n));

        scan.close();
    }
}
