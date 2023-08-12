public class StackwithArray {
   int arr[];
   int capacity;
   int top;
    StackwithArray(int c){
          arr=new int[c];
          capacity=c;
          top=-1;
    }
      public void push(int data){
          if(top==capacity-1){
            System.out.println("Stack is full");
            return;
          }
          arr[++top]=data;
          return;
      }
      
      public void print(){
        if(top==-1){
             System.out.println("Stack is empty");
            return ;
        }
        for(int i=0;i<=top;i++){
            System.out.print( arr[i]+" ");
        }
         System.out.println( " ");
      }
      public void pop(){
        if(top==-1){
             System.out.println("Stack is empty");
            return;
        }
        top--;
      }


    public static void main(String[] args) {
        StackwithArray stack=new  StackwithArray(5);
           stack.push(10);
           stack.push(20);
           stack.push(30);
           stack.print();
           stack.pop();
           stack.print();
    }
}