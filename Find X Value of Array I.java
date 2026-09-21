class Solution {
    public long[] resultArray(int[] nums, int k) {
        int n = nums.length;
        long[] result = new long[k];
        long[] dp = new long[k];

        for (int i = 0; i < n; i++) {
            long[] ndp = new long[k];
            
            // Subarray of length 1 starting/ending at index i
            int currentRemainder = (int) (nums[i] % k);
            ndp[currentRemainder]++;

            // Extend existing subarrays ending at index i - 1
            for (int r = 0; r < k; r++) {
                if (dp[r] > 0) {
                    int nextRemainder = (int) (((long) r * nums[i]) % k);
                    ndp[nextRemainder] += dp[r];
                }
            }

            dp = ndp;

            // Accumulate counts for each remainder
            for (int r = 0; r < k; r++) {
                result[r] += dp[r];
            }
        }

        return result;
    }
}
