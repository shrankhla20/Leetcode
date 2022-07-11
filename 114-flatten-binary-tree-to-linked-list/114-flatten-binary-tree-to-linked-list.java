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
    public void flatten(TreeNode root) {
        while(root != null){
            if(root.left != null){
                TreeNode prev = root.left;
                while(prev.right != null)prev = prev.right;
                
                prev.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
    }
}