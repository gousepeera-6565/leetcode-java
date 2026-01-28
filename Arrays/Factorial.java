package gousepeera;

import java.util.Scanner;

public class Factorial {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;   // base case
        }
        return n * factorial(n - 1);   // recursive call
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);

        scan.close();
    }
}
