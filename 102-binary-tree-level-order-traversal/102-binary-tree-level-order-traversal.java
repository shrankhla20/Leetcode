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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<TreeNode> que = new LinkedList<>();
        que.addLast(root);
        while(que.size() != 0){
            int size = que.size();
            ArrayList<Integer> arr = new ArrayList<>();
            while(size-- > 0){
                TreeNode rn = que.removeFirst();
                arr.add(rn.val);
                if(rn.left != null)que.addLast(rn.left);
                if(rn.right != null)que.addLast(rn.right);
            }
            ans.add(arr);
        }
        return ans;
    }
}