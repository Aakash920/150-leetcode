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
    public TreeNode sortedArrayToBST(int[] nums) {
        return tobst(nums,0,nums.length-1);
    }
    public TreeNode tobst(int[] arr, int lo, int hi){
        if(lo>hi) return null;
        int mid=(lo+hi)/2;
        
        TreeNode nn=new TreeNode(arr[mid]);
        nn.left=tobst(arr,lo,mid-1);
        nn.right=tobst(arr,mid+1,hi);
        return nn;
    }
}