// Program to print Half Diamond Pattern using stars
// Input: N
// Output: Half diamond pattern of size N

import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int totalRows = 2 * N - 1;

        for (int i = 1; i <= totalRows; i++) {
            int stars;

            if (i <= N) {
                stars = i;
            } else {
                stars = 2 * N - i;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

      
    }
}
