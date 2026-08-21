class Solution {
    public long findKthSmallest(int[] coins, int k) {
        int n = coins.length;
        int totalSubsets = 1 << n;

        // Precompute LCMs and set bit counts (sizes) for all non-empty subsets
        long[] lcmArr = new long[totalSubsets];
        int[] bitCount = new int[totalSubsets];

        for (int mask = 1; mask < totalSubsets; mask++) {
            long currentLcm = 1;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (((mask >> i) & 1) == 1) {
                    count++;
                    currentLcm = lcm(currentLcm, coins[i]);
                }
            }
            lcmArr[mask] = currentLcm;
            bitCount[mask] = count;
        }

        // Binary search for the smallest amount x such that count(x) >= k
        long low = 1;
        long minCoin = coins[0];
        for (int coin : coins) {
            minCoin = Math.min(minCoin, coin);
        }
        long high = minCoin * (long) k;
        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            if (countAmounts(mid, totalSubsets, lcmArr, bitCount) >= k) {
                ans = mid;
                high = mid - 1; // Try to find a smaller valid amount
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    // Inclusion-Exclusion principle to count valid amounts <= x
    private long countAmounts(long x, int totalSubsets, long[] lcmArr, int[] bitCount) {
        long count = 0;
        for (int mask = 1; mask < totalSubsets; mask++) {
            if (bitCount[mask] % 2 == 1) {
                count += x / lcmArr[mask];
            } else {
                count -= x / lcmArr[mask];
            }
        }
        return count;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return (a / gcd(a, b)) * b;
    }
}
