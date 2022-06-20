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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = head;
        slow.next = reverse(slow.next);
        ListNode mid = slow.next;
        while(mid != null && fast != null){
            if(mid.val != fast.val){
                return false;
            }
            mid = mid.next;
            fast = fast.next;
        }
        slow.next = reverse(slow.next);
        return true;
    }
     private ListNode reverse(ListNode head){
        ListNode newHead = null;
        while(head != null)
           {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
           }
         return newHead;
    }
}