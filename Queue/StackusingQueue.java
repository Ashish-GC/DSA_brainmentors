import java.util.LinkedList;
import java.util.Queue;

public class StackusingQueue {
     static Queue<Integer> queue = new LinkedList<>();
 

    void push(int data){
           queue.offer(data);
           for(int i=0;i<queue.size()-1;i++){
                    queue.offer(queue.poll());
           } 
    }
  void pop(){
        
        queue.poll();
    }
    int top(){
      return  queue.peek();
    }
    public static void main(String[] args) {
        
        StackusingQueue obj = new StackusingQueue();
       
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.pop();
        obj.pop();
         System.out.println(queue);
         
        int top= obj.top();
         System.out.println(top);
         System.out.println(queue);
    }
}
