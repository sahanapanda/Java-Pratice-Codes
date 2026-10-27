class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        
        // First row is all free cells '.'
        char[] firstRowChars = new char[n];
        java.util.Arrays.fill(firstRowChars, '.');
        grid[0] = new String(firstRowChars);
        
        // Subsequent rows have '#' for all columns except the last one
        char[] rowChars = new char[n];
        java.util.Arrays.fill(rowChars, '#');
        rowChars[n - 1] = '.';
        String row = new String(rowChars);
        
        for (int i = 1; i < m; i++) {
            grid[i] = row;
        }
        
        return grid;
    }
}
