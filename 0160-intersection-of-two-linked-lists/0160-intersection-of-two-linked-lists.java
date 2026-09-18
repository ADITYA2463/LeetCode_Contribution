/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static int findLengthofLL(ListNode head)
    {
        int cnt = 1;
        while(head.next != null)
        {
            cnt++;
            head = head.next;
        }

        return cnt;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          ListNode temp =headA;
        int headALen = findLengthofLL(headA);
        int headBLen = findLengthofLL(headB);

        int diff = 0 ;

        if(headALen > headBLen)
        {
            diff = headALen - headBLen ;

            while(diff != 0)
            {

                if(diff == 0)
                {
                    break;
                }

                headA = headA.next;
                diff--;
            }

            while(headA != null && headB != null)
            {
                if(headA == headB)
                {
                    return headA;
                }

                headA = headA.next;
                headB = headB.next;
            }
            
        }
        else
        {
            diff = headBLen - headALen ;

            while(diff != 0)
            {
                

                if(diff == 0)
                {
                    break;
                }

                headB = headB.next;
                diff--;
            }

            while(headA != null && headB != null)
            {
                if(headA == headB)
                {
                    return headA;
                }

                headA = headA.next;
                headB = headB.next;
            }
        }
        
        return null;
            
    }
}