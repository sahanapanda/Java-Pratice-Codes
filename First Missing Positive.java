class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place each number in its correct slot: nums[i] should be at index nums[i] - 1
        int i = 0;
        while (i < n) {
            int correctIdx = nums[i] - 1;
            
            // Check if nums[i] is in range [1, n] and not already at its correct position
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correctIdx]) {
                // Swap nums[i] with nums[correctIdx]
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else {
                i++;
            }
        }

        // Find the first missing positive number
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If 1 to n are all present, the missing number is n + 1
        return n + 1;
    }
}
