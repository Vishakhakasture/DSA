/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(head == null) return true;
        if(root == null) return false;
        
        if(root.val == head.val){
            if(solve(head.next, root.right) || solve(head.next, root.left))
                return true;
        }
        
        if(isSubPath(head, root.right)) return true;
        if(isSubPath(head, root.left)) return true;
        return false;
    }
    public boolean solve(ListNode head, TreeNode root) {
        if(head == null) return true;
        if(root == null || head.val != root.val) return false;
        
        return solve(head.next, root.left) || solve(head.next, root.right);
    }
}



