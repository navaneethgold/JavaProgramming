class Solution {
    public static boolean issame(TreeNode p, TreeNode q){
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        
        // Check if the current nodes are equal
        if (p.val == q.val) {
            // Recursively check the left and right subtrees
            return issame(p.left, q.left) && issame(p.right, q.right);
        }
        
        return false; // If values are not equal
    }
    // public static 

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
            if(issame(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        
    }
}