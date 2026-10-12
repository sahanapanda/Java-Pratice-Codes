import java.util.List;

class Solution {
    public int maxSum(List<Integer> nums, int k) {
        final int MOD = 1_000_000_007;
        int[] cnt = new int[30];

        // Count the frequency of 1 bits at each bit position (0 to 29)
        for (int num : nums) {
            for (int i = 0; i < 30; i++) {
                if ((num & (1 << i)) != 0) {
                    cnt[i]++;
                }
            }
        }

        long res = 0;

        // Greedily construct k large numbers
        for (int i = 0; i < k; i++) {
            long cur = 0;
            // Build the current number from most significant bit to least significant bit
            for (int j = 29; j >= 0; j--) {
                if (cnt[j] > 0) {
                    cur |= (1L << j);
                    cnt[j]--;
                }
            }
            res = (res + (cur * cur) % MOD) % MOD;
        }

        return (int) res;
    }
}
