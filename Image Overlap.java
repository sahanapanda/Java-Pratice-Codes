import java.util.*;

class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // 1. Store encoded coordinates (row * 100 + col) for 1s in both matrices
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (img1[r][c] == 1) list1.add(r * 100 + c);
                if (img2[r][c] == 1) list2.add(r * 100 + c);
            }
        }

        // 2. Count occurrences of each offset vector (p1 - p2)
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxOverlap = 0;

        for (int p1 : list1) {
            for (int p2 : list2) {
                int diff = p1 - p2;
                int count = countMap.getOrDefault(diff, 0) + 1;
                countMap.put(diff, count);
                maxOverlap = Math.max(maxOverlap, count);
            }
        }

        return maxOverlap;
    }
}
