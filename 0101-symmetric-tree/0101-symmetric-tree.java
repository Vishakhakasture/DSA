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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
             
        return isMirror(root.left, root.right);
    }
    private boolean isMirror(TreeNode leftN, TreeNode rightN) {
        if(leftN == null && rightN == null) {
            return true;
        }
        if(leftN == null || rightN == null) {
            return false;
        }
        
        return leftN.val == rightN.val && isMirror(leftN.left, rightN.right) && isMirror(leftN.right, rightN.left);
    }
}

 