class Solution {
    static class Node {
        int maxLen;
        int pre;
        int suf;
        char leftChar;
        char rightChar;
    }

    private Node[] tree;
    private char[] chars;

    private void pushUp(int u, int l, int r) {
        int mid = (l + r) >> 1;
        int leftLen = mid - l + 1;
        int rightLen = r - mid;
        int left = u << 1;
        int right = u << 1 | 1;

        tree[u].leftChar = tree[left].leftChar;
        tree[u].rightChar = tree[right].rightChar;

        // Merge prefix length
        tree[u].pre = tree[left].pre;
        if (tree[left].pre == leftLen && tree[left].rightChar == tree[right].leftChar) {
            tree[u].pre = tree[left].pre + tree[right].pre;
        }

        // Merge suffix length
        tree[u].suf = tree[right].suf;
        if (tree[right].suf == rightLen && tree[left].rightChar == tree[right].leftChar) {
            tree[u].suf = tree[right].suf + tree[left].suf;
        }

        // Merge max length
        tree[u].maxLen = Math.max(tree[left].maxLen, tree[right].maxLen);
        if (tree[left].rightChar == tree[right].leftChar) {
            tree[u].maxLen = Math.max(tree[u].maxLen, tree[left].suf + tree[right].pre);
        }
    }

    private void build(int u, int l, int r) {
        tree[u] = new Node();
        if (l == r) {
            tree[u].maxLen = 1;
            tree[u].pre = 1;
            tree[u].suf = 1;
            tree[u].leftChar = chars[l];
            tree[u].rightChar = chars[l];
            return;
        }
        int mid = (l + r) >> 1;
        build(u << 1, l, mid);
        build(u << 1 | 1, mid + 1, r);
        pushUp(u, l, r);
    }

    private void update(int u, int l, int r, int idx, char ch) {
        if (l == r) {
            tree[u].leftChar = ch;
            tree[u].rightChar = ch;
            return;
        }
        int mid = (l + r) >> 1;
        if (idx <= mid) {
            update(u << 1, l, mid, idx, ch);
        } else {
            update(u << 1 | 1, mid + 1, r, idx, ch);
        }
        pushUp(u, l, r);
    }

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        int n = s.length();
        chars = s.toCharArray();
        tree = new Node[4 * n];

        // Build the segment tree
        build(1, 0, n - 1);

        int k = queryIndices.length;
        int[] ans = new int[k];

        // Process each update query
        for (int i = 0; i < k; i++) {
            int idx = queryIndices[i];
            char ch = queryCharacters.charAt(i);
            chars[idx] = ch;
            update(1, 0, n - 1, idx, ch);
            ans[i] = tree[1].maxLen;
        }

        return ans;
    }
}
