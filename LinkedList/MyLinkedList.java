
class Node{
    int val;
    Node next;  
    Node(int val){
        this.val=val;
        this.next=null;
    }
}


class MyLinkedList {
      Node head;
      Node tail;
      int size=0;
    public MyLinkedList() {
      head=null;
      tail=null;
    }
    
         
    public int get(int index) {
         if (index < 0 || index >= size) {
            return -1;
        }
       Node temp=head;
          for(int i=0;i<index;i++){
            temp=temp.next;
          }
          return temp.val;
    }
    
    public void addAtHead(int val) {
         Node temp=new Node(val);
        if(head==null){
            head=temp;
            size++; 
            return;
        }
        else{
               temp.next=head;
                head=temp;
                size++; 
        }
             
    }
    
    public void addAtTail(int val) {
        Node temp=new Node(val);
        if(head==null){
            tail=temp;
            head=temp;
            size++; 
            return;
        }
          Node temp1=head;
       while(temp1.next !=null){
             temp1=temp1.next;
       }
            temp1.next=temp;
            size++; 
    }
    
    public void addAtIndex(int index, int val) {
         if (index < 0 || index > size) {
            return;
        }
        Node temp=new Node(val);
        if(index==0){
           temp.next = head;
            head = temp;
            size++; 
            return ;
        }
          Node temp1=head;
          Node temp2=temp1;
        for(int i=0;i<index;i++){
            temp2=temp1;
            temp1=temp1.next;
        }
        temp2.next=temp;
        temp.next=temp1;
           size++;  
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
           Node temp=head;
             if(index==0){
                 temp=head.next;
                 head=temp;
                 size--; 
                 return;
             }
             Node temp1=temp;
             for(int i=0;i<index;i++){
                 temp1=temp;
                 temp=temp.next;
             }
             if(temp==null){size--; return;}
             else if(temp.next==null){
                 temp1.next=null;
                 temp=null;
                 size--; 
             }
             else{
               temp1.next=temp.next;
               temp=null;
               size--; 
             }
             
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */