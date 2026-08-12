import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // Expand the window by adding the current element
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            // Shrink the window from the left if the current element's frequency exceeds k
            while (freq.get(nums[right]) > k) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                left++;
            }

            // Update the maximum valid subarray length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
