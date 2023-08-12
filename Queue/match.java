import java.util.*;
// leetcode 1700
public class match {
    static boolean tt(int arr1[],int arr2[]){
       Queue<Integer> queue = new LinkedList<>();
       
       for(int e:arr2){
        queue.offer(e);
       }
        int j=0;
       for(int i=0;i<arr1.length;){
        if(queue.peek()==arr1[i]){
            queue.poll();
           j=i;
            i++;
            
        }
        else{
              while(queue.peek()!=arr1[j]){
             queue.offer(queue.poll());
             j++;
             if(j>arr1.length-1){return false;}
        }
        }
       
  
       }
       if(queue.isEmpty()){return true;}
       return false;
    }
    public static void main(String[] args) {
       
        int arr1[]={1,0,0,1};
        int arr2[]={0,0,1,1};
        System.out.println(tt(arr1,arr2)); 
        
    }
}
