package LeetCode.Easy;
/*
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2
Example 3:

Input: root = []
Output: 0
Example 4:

Input: root = [0]
Output: 1


Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100
 */
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
public class easy104_MaximumDepthofBinaryTree {
    class Solution {
        public int maxDepth(TreeNode root) {
            int answer = 0;
            if(root == null) return answer;

            answer = DFS(0, root);

            return answer;
        }

        private int DFS(int L, TreeNode root) {
            if(root == null) return L;

            return Math.max(DFS(L + 1, root.left),DFS(L + 1, root.right));
        }
    }
}