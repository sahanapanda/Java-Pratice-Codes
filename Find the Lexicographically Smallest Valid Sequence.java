import java.util.Arrays;

class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        
        // last[j] stores the largest index in word1 that matches word2[j] 
        // such that the suffix word2[j...m-1] can still be fully matched.
        int[] last = new int[m];
        Arrays.fill(last, -1);
        
        int j = m - 1;
        for (int i = n - 1; i >= 0; --i) {
            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                last[j] = i;
                j--;
            }
        }
        
        int[] res = new int[m];
        int skip = 0;
        j = 0;
        
        for (int i = 0; i < n && j < m; ++i) {
            boolean isMatch = word1.charAt(i) == word2.charAt(j);
            boolean canChange = (skip == 0) && (j == m - 1 || i < last[j + 1]);
            
            if (isMatch || canChange) {
                if (!isMatch) {
                    skip = 1; // Mark the single allowed mismatch/change as used
                }
                res[j] = i;
                j++;
            }
        }
        
        return j == m ? res : new int[0];
    }
}
