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
// 144. Binary Tree Preorder Traversal
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        //iterative
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty() || node != null) {
            if(node != null) {
                stack.push(node);
                res.add(node.val);
                node = node.left;
            } else {
                node = stack.pop();
                node = node.right;
            }
        }

        return res;
    }
}