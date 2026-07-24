class Solution {
    public int jump(int[] nums) {
        // If the array has only 1 element, 0 jumps are needed
        if (nums.length <= 1) {
            return 0;
        }

        int jumps = 0;
        int current_end = 0;
        int furthest = 0;

        // Iterate through the array (excluding the last element)
        for (int i = 0; i < nums.length - 1; i++) {
            // Update the furthest position reachable from current index
            furthest = Math.max(furthest, i + nums[nums.length - 1 - 1 == 0 ? 0 : i]); 

            // If we have reached the end of the range for the current jump
            if (i == current_end) {
                jumps++;             // Commit to a jump
                current_end = furthest; // Update the boundary for the next jump

                // Optimization: If the next boundary already reaches or exceeds the last index
                if (current_end >= nums.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}
