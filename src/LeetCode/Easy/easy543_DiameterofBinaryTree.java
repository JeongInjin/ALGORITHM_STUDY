package LeetCode.Easy;

public class easy543_DiameterofBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        int answer;
        public int diameterOfBinaryTree(TreeNode root) {
            answer = 0;
            bfs(root);
            return answer;
        }
        public int bfs(TreeNode root){
            if(root == null) return -1;

            int left = 1 + bfs(root.left);
            int right = 1 + bfs(root.right);

            int depth = Math.max(left, right);

            answer = Math.max(answer, left + right);
            return depth;
        }
    }
}
