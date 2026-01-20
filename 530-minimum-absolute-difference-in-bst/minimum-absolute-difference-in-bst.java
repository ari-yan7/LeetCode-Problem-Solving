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
import java.util.PriorityQueue;
class Solution {
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;
        PriorityQueue<Integer> p = new PriorityQueue<>();
        addallnodes(root, p);
        int min = Integer.MAX_VALUE;
        int prev = p.poll();
        while(!p.isEmpty()) {
            int curr = p.poll();
            min = Math.min(min,curr-prev);
            prev = curr;
        }
        return min;
    }
    public void addallnodes(TreeNode root, PriorityQueue<Integer> p) {
        if (root == null) return;
        p.offer(root.val);
        addallnodes(root.right,p);
        addallnodes(root.left,p);
    }
}