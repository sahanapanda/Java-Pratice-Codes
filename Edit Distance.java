class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        // dp[i][j] stores the edit distance for word1[0..i-1] and word2[0..j-1]
        int[][] dp = new int[m + 1][n + 1];
        
        // Fill base cases for converting to/from empty strings
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; 
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }
        
        // Fill the rest of the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    // Characters match, no new operation needed
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Take the minimum of Delete, Insert, or Replace + 1
                    dp[i][j] = 1 + Math.min(dp[i - 1][j],          // Delete
                                   Math.min(dp[i][j - 1],          // Insert
                                            dp[i - 1][j - 1]));    // Replace
                }
            }
        }
        
        return dp[m][n];
    }
}
