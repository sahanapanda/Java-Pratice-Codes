class Solution {
    public int uniquePaths(int[][] grid) {
        final int MOD = 1_000_000_007;
        int m = grid.length, n = grid[0].length;
        
        // down[j]: number of paths entering column j from above
        long[] down = new long[n];
        down[0] = 1;
        
        for (int i = 0; i < m; ++i) {
            long right = 0; // number of paths entering the current cell from the left
            for (int j = 0; j < n; ++j) {
                long above = down[j];
                long merged = (right + above) % MOD;
                
                if (grid[i][j] == 1) {
                    // Mirror: swaps the flows
                    down[j] = right;
                    right = above;
                } else {
                    // Empty cell: merges the flows
                    down[j] = merged;
                    right = merged;
                }
            }
        }
        
        return (int) down[n - 1];
    }
}
