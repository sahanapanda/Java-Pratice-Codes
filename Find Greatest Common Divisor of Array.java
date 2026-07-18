class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        
        // Single pass to find both maximum and minimum values
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        
        // Find the greatest common divisor of min and max
        return gcd(max, min);
    }
    
    // Helper method using Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
