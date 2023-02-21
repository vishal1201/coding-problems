# Majority Element
## Intuition
Sort the array and return the median. If the element occurs more `n / 2` times then, it will cross the n/2 index.

## Approach
1. Sort the array using `Arrays.sort()`.
2. Return the value at `(length - 1 / 2)th` index.

## Complexity
### Time complexity
    O(log(n))

### Space complexity
    O(1)

## Code
```java
import java.util.*;

class MajorityElement {
    public int solution1(int[] nums) {
        Arrays.sort(nums);
        return nums[(nums.length - 1) / 2];
    }
}
```