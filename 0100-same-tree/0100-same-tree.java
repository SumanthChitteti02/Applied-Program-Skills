class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, trees are identical here
        if (p == null && q == null) {
            return true;
        }
        
        // If one is null or values differ, not the same
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        
        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}