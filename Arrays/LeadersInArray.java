// Problem: Leaders in an Array
// Difficulty: Easy
// Approach: Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {

    public static void leadersInArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            boolean isLeader = true;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        leadersInArray(a);
    }
}
