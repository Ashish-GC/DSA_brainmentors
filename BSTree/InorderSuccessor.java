class Solution
{           Node result=null;
   Node inorder(Node root,Node x){
        if(root==null){
            return null;
        }
        
         if(x.data>=root.data){
              inorder(root.right,x);
         }
         else{
             result=root;
             inorder(root.left,x);
         }
         return result;
    }
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
               Node result=inorder( root,x);
                     return result;
         }
         
}