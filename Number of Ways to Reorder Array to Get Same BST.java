import java.util.*;

class Solution {
    private List<List<Long>> table;
    private long mod = 1000000007;

    public int numOfWays(int[] numsList) {
        List<Integer> nums = new ArrayList<>();
        for (int num : numsList) {
            nums.add(num);
        }
        
        int m = nums.size();
        // Build table of Pascal's triangle
        table = new ArrayList<>();
        for (int i = 0; i <= m; ++i) {
            List<Long> row = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1L);
                } else {
                    long val = (table.get(i - 1).get(j - 1) + table.get(i - 1).get(j)) % mod;
                    row.add(val);
                }
            }
            table.add(row);
        }
        
        return (int)((dfs(nums) - 1 + mod) % mod);
    }
    
    private long dfs(List<Integer> nums) {
        int m = nums.size();
        if (m < 3) {
            return 1;
        }
        
        List<Integer> leftNodes = new ArrayList<>();
        List<Integer> rightNodes = new ArrayList<>();
        int root = nums.get(0);
        
        for (int i = 1; i < m; ++i) {
            if (nums.get(i) < root) {
                leftNodes.add(nums.get(i));
            } else {
                rightNodes.add(nums.get(i));
            }
        }
        
        long leftWays = dfs(leftNodes);
        long rightWays = dfs(rightNodes);
        
        long combinations = table.get(m - 1).get(leftNodes.size());
        
        return (((combinations * leftWays) % mod) * rightWays) % mod;
    }
}
