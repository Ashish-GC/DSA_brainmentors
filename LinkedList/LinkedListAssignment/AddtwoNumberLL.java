class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null){return null;}

        ListNode p1=l1;
        ListNode p2=l2;
        ListNode dummy=new ListNode(0,null);
        ListNode result=dummy;

        int carry=0;

        while(p1!=null && p2!=null){

                int add=p1.val+p2.val+carry;
                int digit=add%10;

                ListNode value= new ListNode(digit);
                carry=add/10;

                result.next=value;
                result=result.next;

                p1=p1.next;
                p2=p2.next;
        }
        
        while(p1!=null){
           int add=p1.val+carry;
           int digit=add%10;
           carry=add/10;

                ListNode value= new ListNode(digit);
                result.next=value;
                result=result.next;
    
           p1=p1.next;
        }

        while(p2!=null){
           int add=p2.val+carry;
           int digit=add%10;
            carry=add/10;

                ListNode value= new ListNode(digit);
                result.next=value;
                result=result.next;
    
           p2=p2.next;
        }
         if(carry!=0){
             ListNode value= new ListNode(carry);
             result.next=value;
         }
       
        return dummy.next;
    }
}
