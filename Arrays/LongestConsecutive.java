
import java.util.Arrays;

class LongestConsecutive  {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        // Edge case: empty array
        if (n == 0) {
            return 0;
        }

        // Step 1: Sort the array
        Arrays.sort(nums);

        int cnt = 1;   // current sequence length
        int maxi = 1;  // maximum sequence length

        // Step 2: Traverse array
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    cnt++;  // continue sequence
                } else {
                    maxi = Math.max(maxi, cnt); // update max
                    cnt = 1; // reset count
                }
            }
        }

        // Step 3: Final check
        return Math.max(maxi, cnt);
    }
}
