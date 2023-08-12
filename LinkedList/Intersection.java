public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        int n1=0;
      while(temp1!=null){
          temp=temp.next;
          n1++;
      }
      ListNode temp2=headB;
      int n2=0;
       while(temp1!=null){
          temp=temp.next;
          n2++;
      }


       int size=0;
        temp1=headA; 
        temp2=headB;
       if(n1>n2){
             size=n1-n2;
             for(int i=0;i<size;i++){
                 temp1=temp1.next;
             }
       }
      else if(n2>n1){
             size=n2-n1;
             for(int i=0;i<size;i++){
                 temp2=temp2.next;
             }
       }
       else{size=0;}


       while(temp1.next!=temp2.next){
           temp1=temp1.next;
           temp2=temp2.next;
       }
    return temp1;
          
    }
}