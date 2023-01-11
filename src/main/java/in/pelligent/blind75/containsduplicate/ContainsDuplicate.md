# Contains Duplicate

## Intuition

<!-- Describe your first thoughts on how to solve this problem. -->
Sorting the array and checking until a pair of consecutive numbers aren't the equal. If none found, it means there
aren't any duplicates.
## Approach

<!-- Describe your approach to solving the problem. -->

1. Check for `nums.length != 0`. In this case, we need to even process and instead return right away.
2. Sort the array with the thought of getting duplicates in consecutive positions.
3. Start by noting the first element tagged as `previous` in the array and then iterating from the 2nd element onwards
   till the last element in the array.
4. At every step, check `if (previous == current)` where `current = nums[i]` i.e. the current element in the iteration.
5. If `true`, return `true` as we have found a duplicate. `else` set `previous = current`
6. If the function manages to survive the iteration then it means there weren't any duplicates, so `return false`.

## Complexity

### Time complexity:

      O(nlogn) + O(n)

### Space complexity:

      O(1)

## Code

```java
import java.util.Arrays;

public final class ContainsDuplicate {
   public static boolean solution1(int[] nums) {
      if (nums.length == 0)
         return false;

        Arrays.sort(nums);
        int previous = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            if (previous == nums[i])
                return true;
            previous = nums[i];
        }

        return false;
    }
}

```