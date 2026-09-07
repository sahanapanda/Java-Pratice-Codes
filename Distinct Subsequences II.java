class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1000000007;
        // dp[i] stores the total number of distinct subsequences ending with character ('a' + i)
        long[] dp = new long[26];

        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            long total = 0;
            for (long count : dp) {
                total = (total + count) % MOD;
            }
            // New subsequences formed by appending `c` to all existing subsequences,
            // plus 1 for the single character subsequence `c` itself.
            dp[idx] = (total + 1) % MOD;
        }

        long result = 0;
        for (long count : dp) {
            result = (result + count) % MOD;
        }

        return (int) result;
    }
}
