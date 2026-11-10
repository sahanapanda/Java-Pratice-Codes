class Solution {
    public int climbStairs(int n, int[] costs) {
        int prevThree = 0, prevTwo = 0, prevOne = 0;
        for (int i = 0; i < n; i++) {
            int current = Math.min(prevThree + 9, Math.min(prevTwo + 4, prevOne + 1)) + costs[i];
            prevThree = prevTwo;
            prevTwo = prevOne;
            prevOne = current;
        }
        return prevOne;
    }
}
