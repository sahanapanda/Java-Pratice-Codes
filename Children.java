import java.util.*;

class Solution {
    private List<Integer>[] originalChildren;
    private List<Integer>[] finalChildren;
    private int[] finalParent;
    private int[] answer;
    private int[] lastSeen;
    private String s;

    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        this.s = s;

        originalChildren = new ArrayList[n];
        finalChildren = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            originalChildren[i] = new ArrayList<>();
            finalChildren[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            originalChildren[parent[i]].add(i);
        }

        finalParent = Arrays.copyOf(parent, n);
        lastSeen = new int[26];
        Arrays.fill(lastSeen, -1);

        // Step 1: Determine final parent for every node via DFS + backtracking
        buildFinalTree(0);

        // Step 2: Build adjacency list of the final tree
        for (int i = 1; i < n; i++) {
            finalChildren[finalParent[i]].add(i);
        }

        // Step 3: Compute subtree sizes in the final tree
        answer = new int[n];
        computeSubtreeSize(0);

        return answer;
    }

    private void buildFinalTree(int u) {
        int charIdx = s.charAt(u) - 'a';
        int prevLastSeen = lastSeen[charIdx];

        if (u != 0 && prevLastSeen != -1) {
            finalParent[u] = prevLastSeen;
        }

        lastSeen[charIdx] = u;

        for (int v : originalChildren[u]) {
            buildFinalTree(v);
        }

        // Restore ancestor state when leaving u's branch
        lastSeen[charIdx] = prevLastSeen;
    }

    private int computeSubtreeSize(int u) {
        int size = 1;
        for (int v : finalChildren[u]) {
            size += computeSubtreeSize(v);
        }
        answer[u] = size;
        return size;
    }
}
