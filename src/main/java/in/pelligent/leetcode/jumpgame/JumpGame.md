# JumpGame
## Intuition
Start iterating in reverse starting from index length - 2;
since we aren't considering jump possibility at last index.
Keep iterating and checking if current-index + value >= last-possible-reach,
and update last-reach with index, if so. This way,
we are basically comparing the reachable index and the maximum jump,
but catering only the required jump for next index.

# Approach
1. Initialize `lastReach = nums.length - 1`.
2. Iterate over input array in reverse starting from `nums.length - 2`, all the way upto `i = 0`.
3. If `currentIndex + currentValue >= lastReach`, update `lastReach` with `i`.
4. Return `lastReach == 0`. i.e. we were able to reach starting index.

# Complexity
### Time complexity
    O(n)

### Space complexity
    O(1)

## Code
```java
public class JumpGame {
    public boolean solution1(int[] nums) {
        int lastReach = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= lastReach)
                lastReach = i;
        }

        return (lastReach == 0);
    }
}
```