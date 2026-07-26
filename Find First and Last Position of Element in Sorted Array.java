class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        
        // Find the first occurrence
        result[0] = findBound(nums, target, true);
        
        // If the target is not present, return [-1, -1] immediately
        if (result[0] == -1) {
            return result;
        }
        
        // Find the last occurrence
        result[1] = findBound(nums, target, false);
        
        return result;
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;
        int bound = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                bound = mid;
                if (isFirst) {
                    // Keep searching towards the left for the first position
                    right = mid - 1;
                } else {
                    // Keep searching towards the right for the last position
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return bound;
    }
}
