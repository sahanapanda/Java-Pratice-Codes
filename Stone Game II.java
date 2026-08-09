class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] memo = new int[n][n + 1];
        
        // Compute suffix sums: suffixSum[i] stores the sum of stones from index i to n - 1
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }

        return maxStones(0, 1, suffixSum, memo, n);
    }

    private int maxStones(int i, int M, int[] suffixSum, int[][] memo, int n) {
        // Base case: If remaining piles can all be taken by the current player
        if (i + 2 * M >= n) {
            return suffixSum[i];
        }

        // Return cached result if already computed
        if (memo[i][M] > 0) {
            return memo[i][M];
        }

        int minOpponentStones = Integer.MAX_VALUE;

        // Try taking X piles, where 1 <= X <= 2 * M
        for (int X = 1; X <= 2 * M; X++) {
            minOpponentStones = Math.min(
                minOpponentStones, 
                maxStones(i + X, Math.max(M, X), suffixSum, memo, n)
            );
        }

        // Max stones current player can get = Total remaining stones - Min stones opponent gets next turn
        memo[i][M] = suffixSum[i] - minOpponentStones;
        return memo[i][M];
    }
}
