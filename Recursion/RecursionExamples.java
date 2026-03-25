package Dsa_Java;

import java.util.Scanner;

/**
 *
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

   // 5. Count digits
    public static int countDigits(int n) {
        if (n == 0) return 0;
        return countDigits(n / 10) + 1;
    }


  // 6. Sum of digits
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return sumDigits(n / 10) + (n % 10);
    }

  
    // 7. Reverse string
    public static String reverseString(String s, int i) {
        if (i < 0) return "";
        return s.charAt(i) + reverseString(s, i - 1);
    }

  // 8. Palindrome check
    public static boolean isPalindrome(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return isPalindrome(s, i + 1, j - 1);
    }

  // 9. Sum of array
    public static int sumArray(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + sumArray(arr, i + 1);
    }

   // 10. Josephus Problem
    public static int josephus(int n, int k) {
        if (n == 1) return 0;
        return (josephus(n - 1, k) + k) % n;
    }

    // 11. Subset sum count
    public static int subsetSum(int[] arr, int sum, int i) {
        if (sum == 0) return 1;
        if (sum < 0 || i == arr.length) return 0;

        return subsetSum(arr, sum - arr[i], i + 1)
                + subsetSum(arr, sum, i + 1);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};

       printDesc(9);
      factorial(7);

        
    }
}
