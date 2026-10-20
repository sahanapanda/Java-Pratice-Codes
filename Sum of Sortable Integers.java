class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        
        // Find the sorted target array to compare blocks against
        int[] target = nums.clone();
        java.util.Arrays.sort(target);
        
        int totalSum = 0;
        
        // Iterate over all divisors k of n
        for (int k = 1; k * k <= n; ++k) {
            if (n % k == 0) {
                if (isSortable(nums, target, k)) {
                    totalSum += k;
                }
                int otherK = n / k;
                if (otherK != k) {
                    if (isSortable(nums, target, otherK)) {
                        totalSum += otherK;
                    }
                }
            }
        }
        
        return totalSum;
    }
    
    private boolean isSortable(int[] nums, int[] target, int k) {
        int n = nums.length;
        int L = k;
        
        // Partition into subarrays of length k and verify each
        for (int left = 0; left < n; left += k) {
            int right = left + k - 1;
            
            // Find the first decrease in the current subarray nums[left ... right]
            int dropIdx = -1;
            for (int i = left; i < right; ++i) {
                if (nums[i] > nums[i + 1]) {
                    dropIdx = i;
                    break;
                }
            }
            
            // If already non-decreasing, check direct equality
            if (dropIdx == -1) {
                for (int i = 0; i < L; ++i) {
                    if (nums[left + i] != target[left + i]) {
                        return false;
                    }
                }
            } else {
                // If there are multiple drops, it cannot be fixed by a single cyclic rotation
                for (int i = dropIdx + 1; i < right; ++i) {
                    if (nums[i] > nums[i + 1]) {
                        return false;
                    }
                }
                
                // Verify if rotating at the drop matches the target segment
                int shift = dropIdx + 1 - left;
                for (int i = 0; i < L; ++i) {
                    int originalIdx = left + (i + shift) % L;
                    if (nums[originalIdx] != target[left + i]) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}
