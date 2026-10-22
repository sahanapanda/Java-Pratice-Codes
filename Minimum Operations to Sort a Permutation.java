class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }

        // Find the index of element 0
        int start = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                start = i;
                break;
            }
        }

        boolean asc = true;
        boolean desc = true;

        // Check if the permutation is cyclically increasing or decreasing
        for (int i = 1; i < n; i++) {
            int valAsc = nums[(start + i) % n];
            int valDesc = nums[(start - i + n) % n];

            if (valAsc != i) {
                asc = false;
            }
            if (valDesc != i) {
                desc = false;
            }

            if (!asc && !desc) {
                return -1;
            }
        }

        if (asc) {
            // Case 1: Cyclically increasing
            // Options: rotate left (start) OR reverse + rotate right + reverse (n - start + 2)
            return Math.min(start, n - start + 2);
        }

        if (desc) {
            // Case 2: Cyclically decreasing
            // Options: rotate left then reverse OR reverse then rotate left
            int k = (start + 1) % n;
            return Math.min(k + 1, n - k + 1);
        }

        return -1;
    }
}
