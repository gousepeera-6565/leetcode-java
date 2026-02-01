import java.util.Scanner;

public class ArrayOperations {

    // Find maximum element
    static int max(int[] ar) {
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

 // Find minimum element
    static int min(int[] ar) {
        int min = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        return min;
    }

    // Count occurrences of a given element
    static int count(int[] ar, int key) {
        int c = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == key) {
                c++;
            }
        }
        return c;
    }

public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scan.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }

        System.out.print("Enter element to count: ");
        int k = scan.nextInt();

        System.out.println("Maximum element: " + max(ar));
        System.out.println("Minimum element: " + min(ar));
         System.out.println("Occurrences of " + k + ": " + count(ar, k));

        scan.close();
    }
}
