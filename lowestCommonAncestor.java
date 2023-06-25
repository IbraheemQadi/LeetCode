/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 235. Lowest Common Ancestor of a Binary Search Tree
class Solution {

    public TreeNode lowestCommonAncestor(
        TreeNode root,
        TreeNode p,
        TreeNode q
    ) {
        if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(
            root.right,
            p,
            q
        );
        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(
            root.left,
            p,
            q
        );
        return root;
    }
}