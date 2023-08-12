class Solution {
    public boolean isPalindrome(ListNode head) {
        //   Approach 2
          if(head==null){return false;}
        //   find middle
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        // reverse second half
        ListNode prev=null;
        while(slow!=null){
          ListNode temp= slow.next;
          slow.next=prev;
          prev=slow;
          slow=temp;
        }

        // check palindrome
          ListNode left=head;
          ListNode right=prev;
          while( right!=null){
           if(left.val!=right.val){
               return false;
           }
           left=left.next;
           right=right.next;
          }
          return true;
        }
    }
          