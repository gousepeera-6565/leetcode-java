package gousepeera;

import java.util.Scanner;

public class CountFactors {

    static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        int result = countFactors(n);
        System.out.println("Number of factors of " + n + " is: " + result);

        scan.close();
    }
}
