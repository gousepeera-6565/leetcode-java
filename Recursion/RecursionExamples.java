package Dsa_Java;

import java.util.Scanner;

/**
  
 * Recursion Examples:
 * 1. Print numbers
 * 2. Factorial
 * 3. Fibonacci
 * 4. Natural numbers
 * 5. Count digits
 * 6. Sum of digits
 * 7. Reverse string
 * 8. Palindrome check
 * 9. Sum of array
 * 10. Josephus problem
 * 11. Subset sum count
 */
public class RecursionExamples {

    // 1. Print numbers from n to 1
    public static void printDesc(int n) {
        if (n <= 0) return;
        System.out.println(n);
        printDesc(n - 1);
    }

   // 2. Factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }


  
    // 4. Print natural numbers from 1 to n
    public static void printNatural(int n) {
        if (n == 0) return;
        printNatural(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};

       printDesc(9);
      factorial(7);

        
    }
}
