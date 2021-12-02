package LeetCode.Easy;

public class easy101_SymmetricTree {
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public boolean isSymmetric(TreeNode root) {
     boolean answer = false;
     if(root == null) return true;

     return isSymmetric(root.left, root.right);
    }

 private boolean isSymmetric(TreeNode left, TreeNode right) {
     if(left == null && right == null) return true;
     else if(left == null && right != null) return false;
     else if(left != null && right == null) return false;

     if(left.val != right.val) return false;
     if(!isSymmetric(left.left, right.right)) return false;
     if(!isSymmetric(left.right, right.left)) return false;
     return true;
 }
}
