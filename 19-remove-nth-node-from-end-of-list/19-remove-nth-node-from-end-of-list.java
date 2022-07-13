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
        if(head.next == null|| head == null){
            return null;
        }
        ListNode curr = head;
        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        int k = length - n - 1;
        if(k < 0)return head.next;
        curr = head;
        while(k-- > 0){
            curr = curr.next;
        }
        ListNode del = curr.next;
        curr.next = curr.next.next;
        del.next = null;
        return head;
    }
}