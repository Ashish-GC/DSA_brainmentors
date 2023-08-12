class Solution {
        boolean isValid(TreeNode root,long max,long min){
                   if(root==null){
                       return true;
                   }

                 if(root.val>=max ||  root.val<=min){
                     return false;
                 }
               
                 return isValid(root.left,root.val,min) && isValid(root.right,max,root.val);
                 
              
        }
    public boolean isValidBST(TreeNode root) {
       return isValid(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
}
// construct bst from tree order traversal