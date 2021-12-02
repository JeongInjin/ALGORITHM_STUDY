package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class easy94_BinaryTreeInorderTraversal {
  static class TreeNode {
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
        List<Integer> answer = new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            inorder(root);
            return answer;
        }

        private void inorder(TreeNode root) {
            if(root != null){
                if(root.left != null) inorderTraversal(root.left);
                answer.add(root.val);
                if(root.right != null) inorderTraversal(root.right);
            }
        }
    }
}
