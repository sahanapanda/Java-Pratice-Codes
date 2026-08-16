class Solution {
    public boolean stoneGameIX(int[] stones) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        
        for (int stone : stones) {
            int rem = stone % 3;
            if (rem == 0) {
                cnt0++;
            } else if (rem == 1) {
                cnt1++;
            } else {
                cnt2++;
            }
        }
        
        // If the number of 0-remainder stones is even, Alice wins if both remainders 1 and 2 exist.
        if (cnt0 % 2 == 0) {
            return cnt1 >= 1 && cnt2 >= 1;
        }
        
        // If the number of 0-remainder stones is odd, Alice wins if the absolute difference is > 2.
        return Math.abs(cnt1 - cnt2) > 2;
    }
}
