class Solution {
    public boolean uniformArray(int[] nums1) {
        int minVal = nums1[0];
        boolean hasOdd = false;

        for (int v : nums1) {
            if (v < minVal) {
                minVal = v;
            }
            if ((v & 1) == 1) {
                hasOdd = true;
            }
        }

        // If the smallest value is odd, we can make all elements odd (even - odd = odd).
        if ((minVal & 1) == 1) {
            return true;
        }

        // If the smallest value is even, we can only succeed if there are no odd numbers at all.
        return !hasOdd;
    }
}
