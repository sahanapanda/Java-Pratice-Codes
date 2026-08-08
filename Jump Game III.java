class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        // Iterate up to the second-to-last element
        for (int i = 0; i < nums.length - 1; i++) {
            // Update the furthest reach from the current index
            farthest = Math.max(farthest, i + nums[i]);

            // If we've reached the end of the range for the current jump
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest; // Set the end boundary for the next0 jump
            }
        }

        return jumps;
    }
}
