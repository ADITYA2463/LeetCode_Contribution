/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode DivideLL(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;

        ListNode L1 = DivideLL(head);
        ListNode L2 = DivideLL(newHead);

        return MergeLL(L1 , L2);



    }
    public static ListNode MergeLL(ListNode L1 , ListNode L2)
    {
        ListNode dummy = new ListNode(-1);
        ListNode finalResult = dummy;
        while(L1 != null && L2 != null)
        {
            if(L1.val < L2.val)
            {
                dummy.next = L1;
                L1 = L1.next;
            }
            else
            {
                dummy.next = L2;
                L2 = L2.next;
            }

            dummy = dummy.next;
        }

        if(L1 != null ) dummy.next = L1;
        if(L2 != null) dummy.next = L2;

        return finalResult.next;
    }
    public ListNode sortList(ListNode head) {

        return DivideLL(head);
        
    }
}