import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Map.Entry;

class bnode<T>{
    T data;
    bnode<T> left;
    bnode<T> right;
    bnode(T data){
         this.data=data;
    }
}
 
class op<T>{
    String nodename="root";
        bnode<Integer> insert(){
           Scanner sc= new Scanner(System.in);
           System.out.println("get data for "+nodename);
             int data = sc.nextInt();

             if(data==-1){
                return null;
             }
             bnode<Integer> root = new bnode<>(data);
             
                      nodename="left";
                      root.left=insert();
           
      
                nodename="right";
                root.right=insert();
           

             nodename="root";
            return root;
      
     }

     void print(bnode<T> root){
              if(root == null){
                return ;
              }
                  String result="";
                result+=root.data+"-->";

                if(root.left!=null){
                    result+=" l "+root.left.data;
                }
                  if(root.right!=null){
                    result+=" r "+root.right.data;
                }
                System.out.println(result);
                print(root.left);
                print(root.right);
     } 

     void Inorder(bnode<T> root){
        if(root==null){
             return;
        }
        Inorder(root.left);
        System.out.print(root.data);
        Inorder(root.right);
     }

     void preorder(bnode<T> root){
            if(root==null){
                 return ;
            }
             System.out.print(root.data);
            preorder(root.left);
            preorder(root.right);
     }
     void postorder(bnode<T> root){
             if(root==null){
                 return ;
            }
           
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data);
     }
     void preorderT(bnode<T> root){
          Stack<bnode<T>> stack = new Stack<>();
          if(root==null){
            return;
          }
          stack.push(root);
          while(!stack.isEmpty()){
                 bnode<T> currnode=stack.pop();
                 System.out.print(currnode.data+" ");
                  if(currnode.right!=null){
                        stack.push(currnode.right);
                  }
                  if(currnode.left!=null){
                        stack.push(currnode.left);
                  }
                 
          }    
     }

     void preorderT2(bnode<T> root){
            Stack<bnode<T>> stack = new Stack<>();
      if(root==null){
              return;
            }
            bnode<T> currnode=root;
            while(currnode!=null||!stack.isEmpty()){
                 while(currnode!=null){
                  System.out.print(currnode.data+" ");
                  if(currnode.right!=null){
                    stack.push(currnode.right);
                  }
                  currnode=currnode.left;
                 }
                 if(!stack.isEmpty()){
                  currnode=stack.pop();
                 }
            }
     }

     void inordert(bnode<T> root){
      Stack<bnode<T>> stack = new Stack<>();
      if(root==null){
        return ;
      }
      bnode<T> currnode=root;
      while(currnode!=null||!stack.isEmpty()){
      while(currnode!=null){
        stack.push(currnode);
        currnode=currnode.left;
      }
      currnode=stack.pop();
      System.out.print(currnode.data+" ");
        currnode=currnode.right;
     }
}
void postordert(bnode<T> root){
// in future
         
}

// bft level order traversal
void levelorder(bnode<T> root){
    if(root==null){return;}
    Queue<bnode<T>> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
      bnode<T> node =queue.poll();
      System.out.print(node.data+" ");
      if(node.left!=null){
        queue.offer(node.left);
      }
      if(node.right!=null){
        queue.offer(node.right);
      }
    }
}
  void levelorder2(bnode<T> root){
      if(root==null){return;}
       Queue<bnode<T>> queue = new LinkedList<>();

       queue.offer(root);
       
       while(!queue.isEmpty()){
            int count=queue.size();
            for(int i=0;i<count;i++){
                   
                     bnode<T> node=queue.poll();
                     System.out.print(node.data+" ");

                     if(node.left!=null){
                           queue.offer(node.left);
                     }
                     if(node.right!=null){
                            queue.offer(node.right);
                     }

            }
                   System.out.println();
       }
  }
  // height of a tree
       int height(bnode<T> root){
         if(root==null){
          return 0;
         }

         int left=height(root.left);
         int right=height(root.right);
         int value=Math.max(left,right);

         return value+1;

       }

      //  size of the tree
      int size(bnode<T> root){
        if(root==null){
          return 0;
        }
        int counter=1;
      counter=counter+ size(root.left);
      counter=counter+ size(root.right);
      return counter;
      }


// k distance node print
    void kdistance(bnode<T> root,int k){
          if(root==null){return;}
        Queue<bnode <T>> queue = new LinkedList<>();
             int counter=0;
        queue.offer(root);
        while(!queue.isEmpty()){
          int size=queue.size();
          for(int i=0;i<size;i++){
               bnode<T> node = queue.poll();
               if(counter==k){
                    System.out.print(node.data+" ");
               }
               if(node.left!=null){
                 queue.offer(node.left);
               }
               if(node.right!=null){
                      queue.offer(node.right);
               }
               
          }
          counter++;
        }
          
    }
     int maxlevel=0;
    void leftview(bnode<T> root,int currentl){
         if(root==null){
          return;
         }
      if(maxlevel<currentl){
        System.out.print(root.data+" ");
        maxlevel=currentl;
      }
      leftview(root.left,currentl+1);
      leftview(root.right, currentl+1);

    }
 

    void leftviewT(bnode<T> root){
             Queue<bnode<T>> queue = new LinkedList<>();
             if(root==null){
              return;
             }

             queue.offer(root);
             while(!queue.isEmpty()){
                           
                              int queuesize=queue.size();
                               
                          for(int i=0;i<queuesize;i++){
                               bnode<T> curr=queue.poll();
                            if(i==0){
                                System.out.print(curr.data+" ");
                    
                               }
                                 if(curr.left!=null){
                                         queue.offer(curr.left);
                                 }
                                 if(curr.right!=null){
                                           queue.offer(curr.right);
                                 }
                                 
                          }
             }

    }

          // right view 
          int maxl=0;
          void rightview(bnode<T> root,int currl){
               if(root==null){
                return;
               }

            if(maxl<currl){
                System.out.print(root.data);
                maxl=currl;
               }
               rightview(root.right, currl+1);
               rightview(root.left, currl+1);
          }
          // right view traversal
          void rightviewT(bnode<T> root){
            if(root==null){
              return;
            }
             Queue<bnode<T>> queue = new LinkedList<>();

             queue.offer(root);
            while(!queue.isEmpty()){
              int queuesize=queue.size();
               for(int i=0;i<queuesize;i++){
                     bnode<T> curr=queue.poll();
                if(i==0){
                      System.out.print(curr.data+" ");
                     }
                     if(curr.right!=null){
                         queue.offer(curr.right);
                     }
                     if(curr.left!=null){
                          queue.offer(curr.left);
                     }
               }
            }

          }



          // vertical order
                void printverticalorder(bnode<T> root){
                           TreeMap<Integer,ArrayList<T>> map=new TreeMap<>();
                           verticalorder(root, 0, map);

            for(Entry<Integer, ArrayList<T>> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
                }
          void verticalorder(bnode<T> root,int distance,TreeMap<Integer, ArrayList<T>> map){
                  if(root==null){
                   return; 
                  }
                  if(map.get(distance)==null){
                    ArrayList<T> list = new ArrayList<>();
                    list.add(root.data);
                    map.put(distance,list);
                  }
                  else{
                   ArrayList<T> l= map.get(distance);
                   l.add(root.data);
                   map.put(distance,l);
                  }
                         verticalorder(root.left, distance-1, map);
                         verticalorder(root.right, distance+1, map);
          }
          //top view
          void printtopview(bnode<T> root){
            TreeMap<Integer,ArrayList<T>> map=new TreeMap<>();
             topview(root, 0,map);
            for(Entry<Integer,ArrayList<T>> m : map.entrySet()){
                 System.out.println(m.getKey()+" "+m.getValue());
            }
          }
            void topview(bnode<T> root,int distance,TreeMap<Integer, ArrayList<T>> map){
                  if(root==null){
                   return; 
                  }
                  if(map.get(distance)==null){
                    ArrayList<T> list = new ArrayList<>();
                    list.add(root.data);
                    map.put(distance,list);
                  }
                  
                         topview(root.left, distance-1, map);
                         topview(root.right, distance+1, map);
          }

          // bottomview
          void printbottomview(bnode<T> root){
           
            TreeMap<Integer,ArrayList<T>> map=new TreeMap<>();
             verticalorder(root, 0,map);

             for(Entry<Integer,ArrayList<T>> m: map.entrySet()){
                            ArrayList l = m.getValue();
                            System.out.println(l.get(l.size()-1));
             }
          }
          
      boolean childrensum(bnode<Integer> root){
          if(root==null){
            return true;
          }
          if(root.left==null && root.right==null){
             return true;
          }
           int sum=0;
          if(root.left!=null){
             sum=sum+(root.left.data);
          }
          if(root.right!=null){
            sum=sum+ (root.right.data);
          }
          return (sum==root.data && childrensum(root.left) && childrensum(root.right));

      }


      // leetcode 75
       ArrayList<Integer> leafnode(bnode<Integer> root,ArrayList<Integer> leaf){
                  
                   if(root==null){
                       return null;
                   }
                   if(root.left==null && root.right==null){
                       leaf.add(root.data);
                      
                   }

                  leafnode(root.left,leaf);
                  leafnode(root.right,leaf);

                  return leaf; 
           } 

// leetcode 75
int gn=0;
 int traverse(bnode<Integer> root,int max){
              
  if(root==null){
      return gn;
  }
  
  if(max<=root.data){
          max=root.data;
          gn++;
  }

  traverse(root.left,max);
  traverse(root.right,max);
       return gn; 
}

  }
public class revbto {
    public static void main(String[] args) {
         op<Integer> obj = new op<>();
          bnode<Integer> root =obj.insert();
          obj.print(root);
          // obj.Inorder(root);
          //  obj.preorder(root);
          //   obj.postorder(root);
          // obj.preorderT(root);
          // obj.preorderT2(root);
          // obj.inordert(root);
          // obj.postordert(root);
          // obj.levelorder(root);
          obj.levelorder2(root);
         System.out.println("height "+ obj.height(root)); 
         System.out.println("size "+obj.size(root));
        
         obj.kdistance(root,1);
         System.out.println("");
         obj.leftview(root, 1);
         System.out.println();
         System.out.println("leftiterative");
         obj.leftviewT(root);
         System.out.println();
         obj.rightview(root,1);
         obj.rightviewT(root);
         System.out.println();
        obj.printverticalorder(root);
        obj.printtopview(root);
        obj.printbottomview(root);
       System.out.println(obj.childrensum(root)); 

        ArrayList<Integer> leaf=new ArrayList<>();
      ArrayList<Integer> l= obj.leafnode(root,leaf);
      for(int ele: l){
        System.out.println(ele);
      }

          System.out.println( obj.traverse(root,Integer.MIN_VALUE));
    }
        


}
