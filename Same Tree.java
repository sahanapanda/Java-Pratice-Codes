class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, they are identical
        if (p == null && q == null) {
            return true;
        }
        
        // If only one is null, or values don't match, they are not identical
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        
        // Check both left and right subtrees recursively
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
