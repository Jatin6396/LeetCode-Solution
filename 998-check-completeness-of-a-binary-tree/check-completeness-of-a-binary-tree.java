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

    public static int count(TreeNode root){
        if(root==null) return 0;
        return 1+count(root.left)+count(root.right);
    }
    public static boolean CBT(TreeNode root,int index,int n){
        if(root==null) return true;
        if(index>=n) return false;
        return CBT(root.left,2*index+1,n) && CBT(root.right,2*index+2,n);
    }
    public boolean isCompleteTree(TreeNode root) {
        int num=count(root);
        return CBT(root,0,num);
    }
}