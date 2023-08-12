import java.io.EOFException;

public class circularQueue {
    // using array
    int capacity=0;
    static int arr[];
    int rear;
    int front;
     circularQueue(int n){
        capacity=n;
        arr= new int[n];
        rear=-1;
        front=-1;
     }
    //  Approach 1
       void enque(int num) throws Exception{
        if(rear==capacity){
           throw new Exception("full");
        }
        rear++;
        arr[rear]=num;
             
       }
        int deque() throws Exception{
               int result;
          if(rear==-1){
                throw new Exception("empty");
             }
             else{
               result= arr[0];
                for(int i=0;i<rear;i++){
                    arr[i]=arr[i+1];
                }
                rear--;
             }
             return result;
       }
    //    approach 2
       void enque1(int num) throws Exception{
           if((rear+1)%capacity==front){
            throw new Exception("full");
           }
           if(front==-1){
            front=0;
           }
           rear=(rear+1)%capacity;
           arr[rear]=num;
       }
       int  deque1() throws Exception{
        int result;
        if(front==-1){
            throw new Exception("empty");
        }
        result=arr[front];

        if(rear==front){
            rear=-1;
            front=-1;
        }
        else{
             front = (front+1)%capacity;
        }
          
                return result;
       }
     public static void main(String[] args) throws Exception {
        circularQueue obj = new circularQueue(4);
           obj.enque1(10);
           obj.enque1(20);
           obj.enque1(30);
           obj.enque1(40);
          int ans= obj.deque1();
                 System.out.println(ans+" ");
                   obj.enque1(50);
                   for(int element:arr){
                    System.out.print(" "+element);
                   }

     }
}
