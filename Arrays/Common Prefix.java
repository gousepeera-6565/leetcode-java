// LeetCode: Longest Common Prefix
// Difficulty: Easy
// Approach: Sorting
// Idea:
// After sorting the array, the common prefix of the first and last string
// will be the longest common prefix for the entire array.
//
// Time Complexity: O(n log n)
// Space Complexity: O(1)


class Solution {
    public String longestCommonPrefix(String[] s) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(s);
        String first = s[0];
        String last = s[s.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}


