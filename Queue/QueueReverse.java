import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse {
   static void  reverse1(Queue<Integer> queue){
              Stack<Integer> stack=new Stack<>();
                  while(!queue.isEmpty()){
                    stack.push(queue.poll());
                }
                while(!stack.isEmpty()){
                    queue.offer(stack.pop());
                }
    }
    static void reverse2(Queue<Integer> queue){
           if(queue.isEmpty()){
            return;
           }
            int d= queue.poll();
            reverse2(queue);
            queue.offer(d);
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
          queue.add(10);
          queue.add(20);
          queue.add(30);
          queue.add(40);
          queue.add(50);
        
          System.out.println(queue);
          reverse1(queue);
          reverse2(queue);
          System.out.println(queue);
    }
}
