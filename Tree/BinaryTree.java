import java.util.Scanner;
import java.util.Stack;

class BinaryNode{
    int data;
     BinaryNode left;
    BinaryNode right;
    BinaryNode(int data){
       this.data=data;
    }
}
class BinaryOperation{
    Scanner sc=new Scanner(System.in);
     String Nodename="root";
      BinaryNode  insert(){
       
           System.out.println("enter the "+Nodename+" or enter -1 to exit");
           int data=sc.nextInt();
           if(data==-1){
            return null;
           }
        //   root
        BinaryNode root =new BinaryNode(data);

        // left
        Nodename="left";
        root.left=insert();

        // right
        Nodename="right";
        root.right=insert();

        // root
        Nodename="root";
        return root;

        }

        void print(BinaryNode root){
            if(root==null){
                return ;
            }
             String result="";

             result+=root.data+"-->";

             if(root.left!=null){
                result+="Left "+root.left.data;
             }
             if(root.right!=null){
                result+="Right "+root.right.data;
             }
             System.out.println(result);
                 print(root.left);
                 print(root.right);
        } 

        void preOrder(BinaryNode root){
            // PLR
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
          void postOrder(BinaryNode root){
            // LRP
            if(root==null){
                return;
            } 
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
          }
            void InOrder(BinaryNode root){
                // LPR
            if(root==null){
                return;
            } 
            InOrder(root.left);
              System.out.print(root.data+" ");
            InOrder(root.right);
          
            }

            // day2

            // iterative way of preorder
        public  void preOrder1(BinaryNode root){
         
            if(root==null){return;}
         
            Stack<BinaryNode> stack = new Stack<>();
           stack.push(root);
          while(!stack.isEmpty()){
            BinaryNode currentNode =stack.pop();
            System.out.println(currentNode.data + " ");

            if(currentNode.right!=null){
                    stack.push(currentNode.right);
            }
            if(currentNode.left!=null){
                    stack.push(currentNode.left);
            }
          }
          System.out.println();
          }

           // iterative way of preorder2
           void preOrder2(BinaryNode root){
            if(root == null){return;}

              Stack<BinaryNode> stack=new Stack<>();
              BinaryNode current=root;

              while(current!=null || !stack.isEmpty()){
                      while(current!=null){
                        System.out.print(current.data+" ");
                        if(current.right!=null){
                            stack.push(current.right);
                        }
                        current=current.left;
                      }
                      if(!stack.isEmpty()){
                        current=stack.pop();
                      }
              }
              System.out.println();
           }

        //    Indorder traversal itterative 1
        void InOrder1(BinaryNode root){
            if(root==null){return ;}
            Stack<BinaryNode> stack = new Stack<>();

            BinaryNode current=root;
            while(current !=null || !stack.isEmpty()){
                while(current!=null){
                    stack.push(current);
                    current=current.left;
                }
                current=stack.pop();
                  System.out.println(current.data+" ");
                current=current.right;
              
            }
        }

        // PostOrder itterative

        void PostOrder1(BinaryNode root){  // still testing
                     Stack<BinaryNode> stack = new Stack<>();
                     BinaryNode current = root;

                     while(current!=null || !stack.isEmpty()){
                      while(current!=null){
                         stack.push(current);
                         current = current.left;
                      }
                      current=stack.pop();
                       System.out.println(current.data);
                      if(current.right!=null){
                        stack.push(current.right);
                         current=current.right;
                      }
                      
                            
                     }
        }
          
}
class BinaryTree{
    public static void main(String[] args) {
         BinaryOperation obj=new  BinaryOperation();
             Scanner sc=new Scanner(System.in); 
             BinaryNode root =new BinaryNode(0);
         while(true){
            System.out.println("Binary Tree Operations ");
            System.out.println("1. Insert");
            System.out.println("2. Print");
            System.out.println("3. Exit");
            System.out.println("Enter the Choice");
            int choice = sc.nextInt();
      
            switch(choice){
              case 1:
              root =obj.insert();
              break;
              case 2: 
            //   obj.print(root);
            //   obj.preOrder(root);
            //   obj.postOrder(root);
            //   obj.InOrder(root);
                //  obj.preOrder1(root);
                //   obj.preOrder2(root);
                // obj.InOrder1(root);
                obj.PostOrder1(root);
              break;  
              case 3:
              return ;  
            }
    }
}
}