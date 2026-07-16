import java.util.Arrays;

class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        long[] prefixGcd = new long[n];
        
        // 1. Maintain the running prefix maximum to construct prefixGcd
        long maxVal = 0;
        for (int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal, nums[i]);
            prefixGcd[i] = gcd(nums[i], maxVal);
        }
        
        // 2. Sort prefixGcd in non-decreasing order
        Arrays.sort(prefixGcd);
        
        // 3. Use two pointers to pair smallest and largest elements
        long totalSum = 0;
        int left = 0;
        int right = n - 1;
        
        while (left < right) {
            totalSum += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }
        
        return totalSum;
    }
    
    // Helper method to calculate the Greatest Common Divisor (GCD)
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
