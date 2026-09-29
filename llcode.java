class Solution {
    private Boolean[][][] memo;
    private int rows, cols;

    public boolean hasValidPath(char[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        // Path length must be even for valid parentheses balancing
        int pathLen = rows + cols - 1;
        if (pathLen % 2 != 0) return false;

        // Must start with '(' and end with ')'
        if (grid[0][0] == ')' || grid[rows - 1][cols - 1] == '(') return false;

        // Maximum possible open parenthesis count cannot exceed pathLen / 2
        memo = new Boolean[rows][cols][pathLen / 2 + 1];

        return dfs(0, 0, 0, grid);
    }

    private boolean dfs(int r, int c, int open, char[][] grid) {
        // Update balance of unmatched '('
        open += (grid[r][c] == '(') ? 1 : -1;

        // Invalid path: unmatched ')' or too many '(' to close in remaining steps
        int remainingSteps = (rows - 1 - r) + (cols - 1 - c);
        if (open < 0 || open > remainingSteps) return false;

        // Reached destination cell
        if (r == rows - 1 && c == cols - 1) {
            return open == 0;
        }

        // Return memoized result if already computed
        if (memo[r][c][open] != null) {
            return memo[r][c][open];
        }

        boolean found = false;

        // Move Down
        if (r + 1 < rows) {
            found = dfs(r + 1, c, open, grid);
        }

        // Move Right
        if (!found && c + 1 < cols) {
            found = dfs(r, c + 1, open, grid);
        }

        return memo[r][c][open] = found;
    }
}
