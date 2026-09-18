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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 1 ; 

       ListNode temp = head;

       while(temp.next != null)
       {
            length++;
            temp = temp.next;
       }

       if(length == n) return head.next;

       int cnt = length - n ;
        temp = head;
       while(cnt != 0)
       {
            cnt--;
            if(cnt == 0)
            {
                break;
            }
        temp = temp.next;
        
       }

       temp.next = temp.next.next;

       return head;
        
    }
}