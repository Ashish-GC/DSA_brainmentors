class Solution {
    int ans=0;
    int count=0;
    void inorder(TreeNode root ,int k){
        if(root==null){
            return;
        }
        inorder(root.left,k);
        count++;
        if(count==k){ans=root.val;}
        inorder(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
       inorder(root,k);
       return ans;
       
            
    }
}