class Solution {
    public static String leafnode(TreeNode root, String str) {
        if (root == null) {
            return str;
        }
        if (root.left == null && root.right == null) {
            str += root.val;
        }

        str = leafnode(root.left, str);
        str = leafnode(root.right, str);
        return str;
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String str1 = leafnode(root1, "");
        String str2 = leafnode(root2, "");

        System.out.println(str1 + " " + str2);
        return str1.equals(str2);
    }
}
