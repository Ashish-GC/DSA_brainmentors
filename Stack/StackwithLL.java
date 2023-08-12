class Node<T>{
   T data;
   Node<T> next;
    Node(T data){
     this.data=data;
     this.next=null;
    }
}

public class StackwithLL<T> {
    Node<T> head;
    Node<T> tail;
    int size;
    StackwithLL(){
         head=null;
         tail=null;
         size=0;
    }

    public void push(T data){
           Node<T> temp= new Node<>(data);
           if(head==null){
            head=temp;
            tail=temp;
            size++;
            return;
           }
           else{
               tail.next=temp;
               tail=temp;
               size++;
           }
    }
    public void print(){
        Node<T> temp= head;
        if(head==null){
             System.out.print("empty");
            return;
        }
        for(int i=1;i<=size;i++){
           System.out.print(temp.data+" ");
           temp=temp.next;
        }
         System.out.println();
    }
    void pop(){
        if(head==null){
              System.out.print("empty");
            return;
        }
        else{
            Node<T> temp=head;
            for(int i=1;i<size;i++){
                temp=temp.next;
            }
            temp.next=null;
            size--;
        }
    }
    public int  peek(){
         return size;
    }
    public static void main(String[] args) {
        StackwithLL<Integer> stack =new StackwithLL<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.print();
         System.out.println(stack.peek());
        stack.pop();
         
        stack.print();
    }
}
