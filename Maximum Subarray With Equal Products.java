import java.math.BigInteger;

class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int res = 2;
        int left = 0;
        long prod = 1L;

        for (int right = 0; right < n; right++) {
            int curr = nums[right];

            // Shrink window until curr shares no common factor with current window product
            while (gcd(prod, curr) > 1L) {
                prod /= nums[left];
                left++;
            }

            // Guard against long overflow when multiplying into the window product
            if (prod > Long.MAX_VALUE / curr) {
                while (left <= right && prod > Long.MAX_VALUE / curr) {
                    prod /= nums[left];
                    left++;
                }
            }

            prod *= curr;
            res = Math.max(res, right - left + 1);
        }

        return res;
    }

    private long gcd(long a, long b) {
        while (b != 0L) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
