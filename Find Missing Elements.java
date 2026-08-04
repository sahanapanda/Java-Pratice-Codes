import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        List<Integer> ans = new ArrayList<>();
        
        // Find missing integers between adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                ans.add(j);
            }
        }
        
        return ans;
    }
}
