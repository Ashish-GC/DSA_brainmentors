class Node<T> {
    T data;
    Node<T> next; // reference variable

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlist<T> {
    Node<T> head;
    Node<T> tail;

    // print
    void print(Node<T> start) {
        Node<T> temp = start;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }

    // add
    public void add(T data) {
        Node<T> newnode = new Node<>(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    // addinanyposition
    void addposition(int pos, T data) {
        Node<T> newnode = new Node<>(data);
        if (pos == 1) {
            newnode.next = head;
            head = newnode;
            return;
        }
        int i = 1;
        Node<T> temp = head;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    // delete any position
void deletePositionWise(int pos){
 if(head==null){
    System.out.println("empty");
    return;
 }
 Node<T> temp=head;
 if(pos==1){
    Node<T> temp3=head;
      temp=head.next;
      head=temp;
      temp3.next=null;
      temp3=null;
      return;
 }
  temp=head;
  int i=1;
   Node<T> temp3=null;
  while(i<pos){
       temp3=temp;
       temp=temp.next;
       i++;
  }
  temp3.next=temp.next;
  temp.next=null;
  temp=null;

}

// detect cycle
void detectcycleandremove(){
       Node<T> slow=head;
       Node<T> fast=head;

       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            System.out.println("yup cycle");
            break;
        }
       }
       if(slow!=fast){
        System.out.println("no cycle");
    return;}

    //    remove cycle
    slow=head;
    while(slow!=fast){
        slow=slow.next;
        fast=fast.next.next;
    }
    fast.next=null;
}


// middle element in linked list
 int middleElement(){
     Node<T> slow=head;
     Node<T> fast=head;

     while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
     }
     return (int) slow.data;
 }

//  kth element from the last
void kelement(int k){
    Node<T> p=head;
    Node<T> q=head;

       for(int i=1;i<=k;i++){
            q= q.next;
       }
       while(q!=null){
        p=p.next;
        q=q.next;
       }
       System.out.println("kth last element : "+p.data);
}
void size(){
    if(head==null){return;}
    Node temp=head;
    int size=0;
    while(temp!=null){
        temp=temp.next;
        size++;
    }
   System.out.println(size);
}

    public static void main(String[] args) {
        // // create
        // Node<Integer> node1=new Node<>(100);
        // Node<Integer> node2=new Node<>(200);
        // // connect
        // node1.next=node2;

        linkedlist<Integer> obj = new linkedlist<>();
        obj.add(100);
        obj.add(200);
        obj.add(300);
        obj.add(400);
        obj.add(500);
         obj.size();
        obj.addposition(1, 999);
        obj.deletePositionWise(1);
        obj.print(obj.head);
        obj.detectcycleandremove();
       int ans= obj.middleElement();
       System.out.println(ans);
      obj.kelement(2);
     
    }
}
