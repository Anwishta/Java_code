package BT;

import javax.swing.tree.TreeNode;

public class sumRootToLeaf {  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
    public int sumNumbers(TreeNode root) {
        
        return sum(root, 0);
    }
        private int sum(TreeNode root, int curSum){
            if(root == null){
            return 0;
        }
            curSum = curSum*10+root.val;
            if(root.left== null && root.right == null){
                return curSum;
            }
            int lsum = sum(root.left, curSum);
            int rsum = sum(root.right,curSum);
            return lsum+rsum;
        }
    

}
