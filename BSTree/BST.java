class BSTNode<T>{
    int data;
    BSTNode left;
    BSTNode right;
    BSTNode(int data){
        this.data=data;
    }
}
class BSToperation<T>{
    BSTNode<T> root;
    void takeTreeValues(){
         root=insert(root,10);
         BSTNode<T> t= insert(root,20);
         t=insert(t,5);
         t=insert(t,7);
         print(root);
        BSTNode result= search(root,5);
        System.out.println(result==null?"not found":"found "+result.data);
       int min= MIN_VALUE(root);
       System.out.println("min value "+min);
        int max= MAX_VALUE(root);
       System.out.println("max value "+max);
       remove(root,root,true,10);
       print(root);
    }
   BSTNode<T> insert(BSTNode<T> currNode,int data){
         if(currNode==null){
            currNode=new BSTNode<T>(data);
            return currNode;
         }
         if(data<currNode.data){
            currNode.left=insert(currNode.left,data);
         }
        else if(data>currNode.data){
                currNode.right=insert(currNode.right,data);
         }
          
         return currNode;
    }

   void print(BSTNode<T> currNode){
            if(currNode!=null){
                print(currNode.left);
                System.out.println(currNode.data);
                print(currNode.right);
            }
    }
    BSTNode<T> search(BSTNode currNode,int item){
             if(currNode==null || currNode.data==item){
                return currNode;
             }
             if(currNode.data>item){
                return search(currNode.left,item);
             }
             else {
                return search(currNode.right,item);
             }
    }
    int MIN_VALUE(BSTNode currNode){
            if(currNode==null){
                return Integer.MIN_VALUE;
            }
            int min=currNode.data;
            while(currNode.left!=null){
                min=currNode.left.data;
                   currNode=currNode.left;
            }
            return min;
    }
    int MAX_VALUE(BSTNode currNode){
            if(currNode==null){
                return Integer.MAX_VALUE;
            }
            int max=currNode.data;
            while(currNode.right!=null){
                max=currNode.right.data;
                   currNode=currNode.right;
            }
            return max;
    }

    void remove(BSTNode currNode,BSTNode parent,boolean isleft, int data){
              if(data<currNode.data){
                remove(currNode.left,currNode,true,data);
              }
              else if(data>currNode.data){
               remove(currNode.right,currNode,false,data);
              }

              else{ //element found
                //    case 1 both side null
                    if(currNode.left==null && currNode.right==null){
                               if(isleft){
                                parent.left=null;
                               }
                               else{
                                parent.right=null;
                               }
                    }
                   // case2   only left null 
                    if(currNode.left==null && currNode.right!=null){
                               if(isleft){
                                parent.left=currNode.right;
                               }
                               else{
                                parent.right=currNode.right;
                               }
                    }
                    //case 3 only right null
                     if(currNode.left!=null && currNode.right==null){
                               if(isleft){
                                parent.left=currNode.left;
                               }
                               else{
                                parent.right=currNode.left;
                               }
                    }

                    // case 4 both value not null
                    if(currNode.left!=null&&currNode.right!=null){
                     int max=MAX_VALUE(currNode.left);
                     currNode.data=max;
                     remove(currNode.left,currNode,true,max);
                    }
              }
              
    }
}
 public class BST{
    public static void main(String[] args) {
        BSToperation<Integer> obj = new BSToperation<>();
         obj.takeTreeValues();
    }
}