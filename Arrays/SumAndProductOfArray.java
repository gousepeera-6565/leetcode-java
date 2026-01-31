package gousepeera;

import java.util.Scanner;

public class SumAndProductOfArray {

    // Method to calculate product of array elements
    static long product(int[] ar) {
        long p = 1;

        for (int i = 0; i < ar.length; i++) {
            p = p * ar[i];
        }
        return p;
    }
