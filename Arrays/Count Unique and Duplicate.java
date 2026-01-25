import java.util.Arrays;

class Solution {

    // Prints duplicate elements
    public static void printDuplicates(int[] nums) {
        boolean found = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                System.out.print(nums[i] + " ");
                found = true;

                // Skip same duplicates
                while (i < nums.length && nums[i] == nums[i - 1]) {
                    i++;
                }
            }
        }

        if (!found) {
            System.out.print("No duplicates");
        }
        System.out.println();
    }

    // Counts unique elements
    public static int countUnique(int[] nums) {
        int count = 1;
        int unique = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count == 1) unique++;
                count = 1;
            }
        }

        if (count == 1) unique++; // last element check
        return unique;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4};

        Arrays.sort(nums);

        System.out.print("Duplicate Elements: ");
        printDuplicates(nums);

        System.out.println("Unique Elements Count: " + countUnique(nums));
    }
}
