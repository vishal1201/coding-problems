# Remove duplicates from sorted list
## Intuition
Iterate over list while checking if next's value equals current; if so, set next to next of next, else, set next to immediate next for iteration.

## Approach
1. Set `temp = head`.
2. if `temp == null` return rightaway.
3. `while temp.next != null` keep checking 1 thing - whether `temp.next.val == temp.val`.
4. If so, remove the immediate next, by setting `temp.next = temp.next.next`.
5. Else, we would like to iterate to the next iteration, so set `temp.next = next`.
6. `return head`.

## Complexity
### Time complexity
    O(n)

### Space complexity
    O(1)

## Code
```java
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class RemoveDuplicatesFromSortedList {
    public ListNode solution1(ListNode head) {
        ListNode temp = head;

        if (head == null)
            return head;

        while (temp.next != null) {
            if (temp.next.val == temp.val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }

        return head;
    }
}
```