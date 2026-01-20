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
import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> vals = new ArrayList<>();
        for (ListNode head : lists) {
            ListNode curr = head;
            while (curr != null) {
                vals.add(curr.val);
                curr = curr.next;
            }
        }
        Collections.sort(vals);
        ListNode result = new ListNode(0);
        ListNode curr = result;
        for (int val : vals) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return result.next;
    }
}