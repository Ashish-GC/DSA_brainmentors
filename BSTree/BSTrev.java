class bstnode<T>{
    int data;
    bstnode<T> left;
    bstnode<T> right;
    bstnode(int data){
       this.data=data;
    }
}
class bstoperations<T>{
    bstnode<T> root ;
     void taketreevalues(){
        root=insert(root,10);
        bstnode<T> t=insert(root,20);
        t=insert(t,7);
        t=insert(t,5);
        t=insert(t,15);
        t=insert(t,30);
        t=insert(t,8);
        print(root);
       bstnode<T> result= search(root,5);
       System.out.println("result "+result.data);
       System.out.println("min : "+min(root));
        remove(root,root,false,20);
        print(root);
     }
     bstnode<T> insert(bstnode<T> currnode,int data){
            if(currnode==null){
                currnode = new bstnode<T>(data);
                return currnode;
            }

            if(data<currnode.data){
               currnode.left=insert(currnode.left,data);
            }
            else if(data>currnode.data){
                currnode.right=insert(currnode.right,data);
            }
            return currnode;
     }

     void print(bstnode<T> root){
        if(root!=null){
           print(root.left);
           System.out.println(root.data);
           print(root.right);
        }

     }

          bstnode<T> search(bstnode<T> currnode,int search){
             if(currnode==null || currnode.data==search){
                return currnode;}

             if(search>currnode.data){
                return search(currnode.right,search);
             }
             else {
               return search(currnode.left,search);
             }
     }
          int min(bstnode<T> currnode){
            int min=0;
            while(currnode!=null){
                min=currnode.data;
                currnode=currnode.left;
            }
            return min;
          }
           int max(bstnode<T> currnode){
            int max=0;
            while(currnode!=null){
                max=currnode.data;
                currnode=currnode.right;
            }
            return max;
          }
          void remove(bstnode<T> currnode,bstnode<T> parent,boolean isleft,int rem){
               if(currnode==null){
                return;
               }
               if(rem<currnode.data){
                remove(currnode.left,currnode,true,rem);
               }
               else if(rem>currnode.data){
                remove(currnode.right,currnode,false,rem);
               }
               else{
                //  case1 
                if(currnode.left==null && currnode.right==null){
                       if(isleft){
                        parent.left=null;
                       }
                       else{
                         parent.right=null;
                       }
                }
                // case2
                if(currnode.left!=null && currnode.right==null){
                       if(isleft){
                        parent.left=currnode.left;
                       }
                       else{
                         parent.right=currnode.left;
                       }
                }
                // case3
                if(currnode.left==null && currnode.right!=null){
                       if(isleft){
                        parent.left=currnode.right;
                       }
                       else{
                         parent.right=currnode.right;
                       }
                }
                // case4
                if(currnode.left!=null && currnode.right!=null){
                       int max = max(currnode.left);
                       currnode.data=max;
                       remove(currnode.left,currnode,true,max);
                }
               }
          }
}

public class BSTrev<T>{
    public static void main(String[] args) {
        bstoperations<Integer> obj = new bstoperations<>();
        obj.taketreevalues();
    }
}
