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
    public void reorderList(ListNode head) {
        //first find the middle node
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //separate the second half
        ListNode secHalf = slow.next;
        slow.next = null;

        //reverse the second half
        ListNode prev = null;
        ListNode curr = secHalf;
        while(curr != null){
            ListNode nextNode = curr.next;
                 curr.next = prev;
                 prev = curr;
                 curr = nextNode;
        }
        //prev now head of second half
        //weave two halves

        ListNode first = head;
        ListNode second = prev;
        while (second != null){
            ListNode nextFirst = first.next;
            ListNode nextSecond = second.next;

            first.next = second;
            second.next = nextFirst;

            first =nextFirst;
            second =nextSecond;
        }
    }
}
