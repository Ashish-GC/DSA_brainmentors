import java.util.ArrayList;

class StackwithArrayList{
    ArrayList<Integer> stack ;
    StackwithArrayList(){
            stack=new ArrayList<>();
    }
    void push(int num){
         stack.add(num);
         return;
    }

    void pop() throws Exception{
        if(stack.isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int size=stack.size()-1;
        stack.remove(size);
        return;
    }
    public int  peek() throws Exception{
        if(stack.isEmpty()){throw new Exception("Stack is empty");}
        return stack.get(stack.size()-1);
    }
    void print(){
        System.out.println(stack);
    }
    public static void main(String[] args) throws Exception {
       StackwithArrayList stack =new StackwithArrayList();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.print();
        stack.pop();
        stack.print();
       
        
     System.out.println(stack.peek());
    }
}