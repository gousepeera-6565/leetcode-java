 
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

    public static void main(String[] args) {

        int[] nums = {2, 7, 9, 3, 1};

        System.out.println("Maximum amount: " + rob(nums));
    }
}
