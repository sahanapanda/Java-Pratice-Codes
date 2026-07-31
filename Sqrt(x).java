class Solution {
    public int mySqrt(int x) {
        // Handle small base cases
        if (x < 2) {
            return x;
        }
        
        int left = 2;
        int right = x / 2;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Use long to prevent potential integer overflow
            long num = (long) mid * mid; 
            
            if (num == x) {
                return mid;
            } else if (num > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return right;
    }
}
