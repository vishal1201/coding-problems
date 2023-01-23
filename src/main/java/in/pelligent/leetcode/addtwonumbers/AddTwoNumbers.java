package in.pelligent.leetcode.addtwonumbers;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class AddTwoNumbers {
    public ListNode solution1(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0, null);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {

            int x = 0;
            if (l1 != null) {
                x = l1.val;
            }

            int y = 0;
            if (l2 != null) {
                y = l2.val;
            }

            int digit = carry + x + y;
            carry = digit / 10;
            current.next = new ListNode(digit % 10, null);
            current = current.next;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {
            current.next = new ListNode(carry, null);
        }

        return dummyHead.next;
    }
}
