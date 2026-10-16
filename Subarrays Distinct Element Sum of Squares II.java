import java.util.HashMap;
import java.util.Map;

class Solution {
    static class BIT {
        int size;
        long[] tree1;
        long[] tree2;

        public BIT(int n) {
            size = n;
            tree1 = new long[n + 2];
            tree2 = new long[n + 2];
        }

        private int lowbit(int index) {
            return index & -index;
        }

        public void add(int left, int right, int delta) {
            addInternal(left, delta);
            addInternal(right + 1, -delta);
        }

        public long query(int left, int right) {
            return queryInternal(right) - queryInternal(left - 1);
        }

        private void addInternal(int index, int delta) {
            int rawIndex = index + 1;
            int idx = rawIndex;
            while (idx <= size) {
                tree1[idx] += delta;
                tree2[idx] += (long) rawIndex * delta;
                idx += lowbit(idx);
            }
        }

        private long queryInternal(int index) {
            int rawIndex = index + 1;
            long sum1 = 0;
            long sum2 = 0;
            int idx = rawIndex;
            while (idx > 0) {
                sum1 += tree1[idx];
                sum2 += tree2[idx];
                idx -= lowbit(idx);
            }
            return (long) (rawIndex + 1) * sum1 - sum2;
        }
    }

    public int sumCounts(int[] nums) {
        int n = nums.length;
        BIT bit = new BIT(n);
        Map<Integer, Integer> lastSeen = new HashMap<>();
        long MOD = 1_000_000_007;
        long res = 0;
        long cur = 0;

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int j = lastSeen.getOrDefault(x, -1) + 1;
            
            // Query the sum of previous distinct counts over the range [j, i]
            long prevSum = bit.query(j, i);
            
            // The squared distinct counts increase by 2 * sum(x) + (i - j + 1)
            long totalIncrease = (2 * prevSum + (i - j + 1)) % MOD;
            cur = (cur + totalIncrease) % MOD;
            res = (res + cur) % MOD;
            
            // Update BIT for range [j, i] with delta = 1
            bit.add(j, i, 1);
            lastSeen.put(x, i);
        }

        return (int) res;
    }
}
