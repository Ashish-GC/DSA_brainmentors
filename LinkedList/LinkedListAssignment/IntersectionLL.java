public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

         if(headA==null || headB==null){
             return null;
         }

        ListNode tempA=headA;
        ListNode tempB=headB;
        
     int A=0;int B=0;
        while(tempA!=null){
            A++;
            tempA=tempA.next;
        }
          while(tempB!=null){
                B++;
            tempB=tempB.next;
          }
        ListNode a=headA;
        ListNode b=headB;
          if(A>B){
              int k=A-B;
              while(k>0){
                  a=a.next;
             k--;
              }
              }
             if(B>A){
               int k=B-A;
              while(k>0){
                  b=b.next;
                     k--;
              }
              }
          
          while(a!=null ){
                if(a==b){
                  return a;
               }
               a=a.next;
               b=b.next;
              
          }
             return null;

    }
}
