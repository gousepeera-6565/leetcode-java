 
package Dsa_Java;

/**
  
 * Problem: House Robber (LeetCode)
 * 
 * You cannot rob two adjacent houses.
 * Find the maximum amount you can rob.
 */
public class HouseRobber {

    public static int rob(int[] nums) {

        int rob = 0;     // Max money if current house is robbed
        int noRob = 0;   // Max money if current house is not robbed

        for (int i = 0; i < nums.length; i++) {

            int newRob = noRob + nums[i];          // Rob current house
            int newNoRob = Math.max(noRob, rob);   // Skip current house

            rob = newRob;
            noRob = newNoRob;
        }

        return Math.max(rob, noRob);
    }



/**
 
 * Problem: House Robber (Alternative Approach)
 * 
 * Using Dynamic Programming Array
 */
 public static int rob(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        // dp[i] = max money that can be robbed till house i
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            // Either skip current house or rob it
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[nums.length - 1];
    }


 
    public static void main(String[] args) {

        int[] nums = {2, 7, 9, 3, 1};

        System.out.println("Maximum amount: " + rob(nums));
    }
}
