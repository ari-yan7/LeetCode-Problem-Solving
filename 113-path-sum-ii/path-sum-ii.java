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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        pathhelper(root, paths, current, targetSum);
        return paths;
    }
    public void pathhelper(TreeNode root, List<List<Integer>> paths, List<Integer> current, int targetSum) {
        if (root == null) return;
        current.add(root.val);
        if (root.left == null && root.right == null && targetSum - root.val == 0){
            paths.add(new ArrayList<>(current));
        }
        pathhelper(root.left, paths, current, targetSum - root.val);
        pathhelper(root.right, paths, current, targetSum - root.val);
        current.remove(current.size() - 1);
    }
}