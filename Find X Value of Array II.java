class Solution {
    static class Node {
        int[] cnt; // cnt[x] stores count of non-empty prefixes of this segment with product % k == x
        int totalProd; // total product of all elements in this segment % k

        Node(int k) {
            cnt = new int[k];
            totalProd = 1;
        }
    }

    private int K;
    private Node[] tree;
    private int N;

    private Node merge(Node left, Node right) {
        Node res = new Node(K);
        res.totalProd = (left.totalProd * right.totalProd) % K;

        // Copy prefix count from left child
        for (int i = 0; i < K; i++) {
            res.cnt[i] = left.cnt[i];
        }

        // Prefixes that cross into the right child:
        // (left.totalProd * right_prefix_product) % K
        for (int j = 0; j < K; j++) {
            if (right.cnt[j] > 0) {
                int rem = (left.totalProd * j) % K;
                res.cnt[rem] += right.cnt[j];
            }
        }

        return res;
    }

    private void build(int[] nums, int node, int start, int end) {
        if (start == end) {
            tree[node] = new Node(K);
            int val = nums[start] % K;
            tree[node].totalProd = val;
            tree[node].cnt[val] = 1;
            return;
        }
        int mid = start + (end - start) / 2;
        build(nums, 2 * node, start, mid);
        build(nums, 2 * node + 1, mid + 1, end);
        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    private void update(int node, int start, int end, int idx, int val) {
        if (start == end) {
            tree[node] = new Node(K);
            int rem = val % K;
            tree[node].totalProd = rem;
            tree[node].cnt[rem] = 1;
            return;
        }
        int mid = start + (end - start) / 2;
        if (start <= idx && idx <= mid) {
            update(2 * node, start, mid, idx, val);
        } else {
            update(2 * node + 1, mid + 1, end, idx, val);
        }
        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    private Node query(int node, int start, int end, int l, int r) {
        if (r < start || end < l) {
            return null;
        }
        if (l <= start && end <= r) {
            return tree[node];
        }
        int mid = start + (end - start) / 2;
        Node left = query(2 * node, start, mid, l, r);
        Node right = query(2 * node + 1, mid + 1, end, l, r);

        if (left == null) return right;
        if (right == null) return left;
        return merge(left, right);
    }

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        this.K = k;
        this.N = nums.length;
        this.tree = new Node[4 * N];

        build(nums, 1, 0, N - 1);

        int qLen = queries.length;
        int[] ans = new int[qLen];

        for (int i = 0; i < qLen; i++) {
            int idx = queries[i][0];
            int val = queries[i][1];
            int start = queries[i][2];
            int x = queries[i][3];

            // Update persistent value
            update(1, 0, N - 1, idx, val);

            // Query interval [start, N - 1]
            Node res = query(1, 0, N - 1, start, N - 1);
            ans[i] = (res != null) ? res.cnt[x] : 0;
        }

        return ans;
    }
}
