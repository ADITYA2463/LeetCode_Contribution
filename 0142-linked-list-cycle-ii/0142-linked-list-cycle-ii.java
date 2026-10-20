/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    private static ListNode startingPoint(ListNode fast , ListNode slow , ListNode head)
    {
        slow = head ;
        
        while(slow != null)
        {
            if(slow == fast)
            {
                break;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
        
    }
    public ListNode detectCycle(ListNode head) {

       
     ListNode fast = head ; 
        ListNode slow = head ;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
            {
                return startingPoint(fast , slow ,head);
            }
           
        }

        return null;
        
    }
}