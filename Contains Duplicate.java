import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // If add() returns false, the element is already in the set
            if (!seen.add(num)) {
                return true;
            }
        }
        
        return false;
    }
}
