import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int totalElements = m * n;
        
        // Optimize k if it is larger than the total number of elements
        k = k % totalElements;
        
        // Initialize the result list structure with empty sub-lists
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            result.add(new ArrayList<>(n));
            for (int j = 0; j < n; j++) {
                result.get(i).add(0); // Pre-fill with placeholder values
            }
        }
        
        // Map each element from the original grid to its new shifted position
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int old1DIndex = r * n + c;
                int new1DIndex = (old1DIndex + k) % totalElements;
                
                int newRow = new1DIndex / n;
                int newCol = new1DIndex % n;
                
                result.get(newRow).set(newCol, grid[r][c]);
            }
        }
        
        return result;
    }
}
