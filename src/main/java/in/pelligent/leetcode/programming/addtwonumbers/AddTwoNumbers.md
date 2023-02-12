# Add Two Numbers
## Intuition
Keep computing till both the nodes, l1, l2 are not null. Every iteration, check which of 2 aren't null. update the current additive with the corresponding value. Calculate current total as previous carry + current additive -> x+y for both l1, l2. Keep updating l1, l2 with their next, as applicable.

## Approach
1. Initialize `ListNode dummyHead = new ListNode(0, null);`.
2. Initialize a `ListNode current = dummyHead;` reference.
3. Keep adding `l1+l2` while `(l1 != null || l2 != null)`.
4. At every iteration, check if either of them are `not null`. If so, extract the values. in `x, y` respectively.
5. Calculate `int digit = carry + x + y;`.
6. Update next `carry` with `digit / 10;`.
7. Update `current.next` with `new ListNode(digit % 10, null);`.
8. Set `current = current.next;`.
9. Lastly, return `dummyHead.next`.

## Complexity
### Time complexity
O(max(l1.length, l2.length))

# Space complexity:
O(1)

# Code
```java
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
```