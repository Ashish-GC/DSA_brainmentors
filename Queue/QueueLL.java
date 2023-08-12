class Node{
    int data;
    Node next;
    Node(int data){
         this.data=data;
         this.next=null;
    }
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}  
    
class QueueLL{
    Node head;
    Node tail;
    void enqueue(int data){
      Node node = new Node(data);
      if(head==null){
       head=node;
       tail=node;
      }
      else{
           tail.next=node;
           tail=node;
      }
    }
    void print(){
        Node temp=head;
        while(temp!=null){
             System.out.print(temp.data+" ");
            temp=temp.next; 
        }
        System.out.println("");
    }
    void dequeue(){
 

        if(head==null){
            return;
        }
        else{
             head=head.next;
        }
    }
    public static void main(String[] args) {
        QueueLL obj=new QueueLL();
        
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.print();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.print();
    }
}