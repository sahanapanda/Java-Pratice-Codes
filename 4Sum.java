import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }

        // Sort the array to use two pointers and skip duplicates easily
        Arrays.sort(nums);
        int n = nums.length;

        // First pointer
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Second pointer
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicate values for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // Two pointers for the remaining two elements
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    // Use long to prevent integer overflow during summation
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicate values for the third element
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        // Skip duplicate values for the fourth element
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        // Move both pointers after finding a valid quadruplet
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++; // Sum is too small, move left pointer rightward
                    } else {
                        right--; // Sum is too large, move right pointer leftward
                    }
                }
            }
        }

        return result;
    }
}
