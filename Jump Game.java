class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // If the current index is greater than the maximum reachable index,
            // it means we got stuck at a 0 earlier and cannot proceed further.
            if (i > reachable) {
                return false;
            }
            
            // Update the maximum reachable index from the current position
            reachable = Math.max(reachable, i + nums[i]);
            
            // Optimization: If we can already reach or exceed the last index, return true
            if (reachable >= nums.length - 1) {
                return true;
            }
        }
        
        return true;
    }
}
