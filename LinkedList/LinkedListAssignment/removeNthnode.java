class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=head;

        for(int i=1;i<=n;i++){
             fast=fast.next;
        }
         
         while(fast!=null ){
             prev=slow;
             slow=slow.next;
             fast=fast.next;
         }
         if(slow==head){
                   head=slow.next;   
         }
         else if(slow.next==null){
             prev.next=null;
         }
         else {
             prev.next=slow.next;
         }
        
         return head;
    }
}