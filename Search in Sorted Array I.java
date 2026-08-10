class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return true;
            }

            // Edge case: duplicates at low, mid, and high
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }

            // Left half is sorted
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1; // target is in the left half
                } else {
                    low = mid + 1;  // target is in the right half
                }
            } 
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;  // target is in the right half
                } else {
                    high = mid - 1; // target is in the left half
                }
            }
        }

        return false;
    }
}
