import java.util.Stack;

public class QueueusingStack {
     static Stack<Integer> stack1 = new Stack<>();
     static Stack<Integer> stack2 = new Stack<>();

    void offer(int data){
       stack1.push(data);
    }
  void poll(){
        if(!stack2.isEmpty()){
            stack2.pop();
            return ;
        }
        else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack2.pop();
            return ;
        }
        
    }
    int top(){
         if(!stack2.isEmpty()){
            return stack2.peek();
        }
        else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.peek();
        }

    }
    public static void main(String[] args) {
        
        QueueusingStack obj = new QueueusingStack();
       
        obj.offer(10);
        obj.offer(20);
        obj.offer(30);
        obj.offer(40);
        // obj.poll();
        // obj.poll();
         System.out.println(stack1);
         
        int top= obj.top();
         System.out.println(top);
         System.out.println(stack2);
    }
}
