import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        // Values are constrained between 1 and 100
        boolean[] seen1 = new boolean[101];
        boolean[] seen2 = new boolean[101];
        boolean[] seen3 = new boolean[101];

        for (int num : nums1) {
            seen1[num] = true;
        }
        for (int num : nums2) {
            seen2[num] = true;
        }
        for (int num : nums3) {
            seen3[num] = true;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            int count = (seen1[i] ? 1 : 0) + (seen2[i] ? 1 : 0) + (seen3[i] ? 1 : 0);
            if (count >= 2) {
                result.add(i);
            }
        }

        return result;
    }
}
