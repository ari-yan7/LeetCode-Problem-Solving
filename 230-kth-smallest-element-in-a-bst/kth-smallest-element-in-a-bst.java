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
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return 0;
        PriorityQueue<Integer> p = new PriorityQueue<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> current = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                current.add(temp.val);
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
            for (Integer val : current) {
                p.add(val);
            }
        }
        for (int i = 1; i <= k; i++) {
            if (i == k) return p.poll();
            p.poll();
        }
        return 0;
    }
}