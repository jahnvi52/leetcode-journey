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
    public ListNode detectCycle(ListNode head) {
        // Initialize slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect if a cycle exists
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            // Cycle detected
            if (slow == fast) {

                // Step 2: Find the starting node of the cycle
                ListNode ptr = head;

                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }

                // ptr (or slow) is the start of the cycle
                return ptr;
            }
        }

        // No cycle exists
        return null;
        
    }
}