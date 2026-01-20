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
        if (head == null || head.next == null){
            return null;
        }
        ListNode current = head;
        int count = 0;
        while (current != null){
            count++;
            current = current.next;
        }
        if (n == count) {
            return head.next;
        }
        int m = count-n;
        current = head;
        for (int i = 1; i < m; i++){
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }
}