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
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        int count = 0;
        while (current.next != null){
            count++;
            current = current.next;
        }
        int result = 0;
        if (count % 2 == 0){
            result = count/2;
        } else {
            result = (count/2)+1;
        }
        for (int i = 0; i < result; i++){
            head = head.next;
        }
        return head;
    }
}