# Two Number Sum

## Intuition

<!-- Describe your first thoughts on how to solve this problem. -->
Persist a map of visited elements in the array with the index and then while iterting over the input array, try to see
if we have previously visited an element that along with current element adds up to the target.

## Approach

<!-- Describe your approach to solving the problem. -->

1. Start by Initializing a `Map<Integer, Integer>` that would be used to record visited element's `value, index`.
2. Iterate over the input array.
3. At every iteration, check if `visited.containsKey(target - nums[i])`. This tries to find a compliment in
   the `visisted` which, along with the current element in iteration, will sum up to the target.
4. If such an element was pre-visited, extract the index of this element, and return the current iteration's index along
   with it.
5. Else, store the current iteration element alongside it's index in the visited map.
6. At last, if the function passed the for loop, it means no pair exists that adds upto the `target`. Return the default
   response.'

## Complexity

### Time complexity

    O(n)

### Space complexity

    O(n)

# Code

```java
import java.util.Map;
import java.util.HashMap;

class TwoNumberSum {

    public int[] solution1(int[] nums, int target) {
        int[] pair = new int[2];

        Map<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (visited.containsKey(target - nums[i])) {
                pair[0] = visited.get(target - nums[i]).intValue();
                pair[1] = i;
                break;
            }
            visited.put(nums[i], i);
        }

        return pair;
    }
}
```