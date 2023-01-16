# Missing Number

## Intuition

Sort the array & iterate over the entire array while comparing index with the current number.

## Approach

1. Sort input array
2. Initialize an iterator outside the loop.
3. Keep iterating as well as comparing the index with current element and return the index at the first encountered
   inequality.
4. If the function makes it through the loop without returning, the final index.

## Complexity

### Time complexity

    O(n)

### Space complexity

    O(1)

## Code

```java
import java.util.Arrays;

public class MissingNumber {

    public int solution1(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for (i = 0; i < nums.length; ++i) {
            if (i != nums[i])
                return i;
        }

        return i;
    }
}
```