class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        
        // dp[i][j] will store the maximum relative score gain a player 
        // can get from the subarray nums[i...j]
        int[][] dp = new int[n][n];

        // Base cases: single element subarrays
        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }

        // Fill DP table for subarray lengths from 2 to n
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                int pickLeft = nums[i] - dp[i + 1][j];
                int pickRight = nums[j] - dp[i][j - 1];
                
                dp[i][j] = Math.max(pickLeft, pickRight);
            }
        }

        // Player 1 wins if maximum net difference >= 0
        return dp[0][n - 1] >= 0;
    }
}
