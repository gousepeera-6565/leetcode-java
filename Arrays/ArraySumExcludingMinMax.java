import java.util.Scanner;

public class ArraySumExcludingMinMax {

    static int max(int[] ar) {
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

       static int min(int[] ar) {
        int min = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        return min;
    }

    


  public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] ar = new int[5];

        System.out.println("Enter 5 array elements:");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }

          int maxValue = max(ar);
           int minValue = min(ar);


      
        // Sum excluding maximum element
        System.out.println("Sum excluding maximum: " + (totalSum - maxValue));

  }
}
