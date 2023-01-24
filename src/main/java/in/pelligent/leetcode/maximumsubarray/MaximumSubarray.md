# Maximum Subarray
## Intuition
Iterate and keep adding current number in `tillHer` and updating `soFar` with `tillHere` if `soFar < tillHere`.
Return `soFar`.

## Approach
1. Initialize `soFar = Integer.MIN_VALUE`.
2. Initialize `tillHere = 0`.
3. Iterate over `nums`. For each `num` do the following -
   1. `tillHere += num`.
   2. check `if soFar < tillHere` if so, update `soFar = tillHere`
   3. if `tillHere < 0`, update `tillHere = 0`
4. Return `soFar`.

## Complexity
### Time complexity
    O(n)
### Space complexity
    O(1)
## Code
```java
public class MaximumSubarray {
    public int solution1(int[] nums) {
        int soFar = Integer.MIN_VALUE;
        int tillHere = 0;
        for (int num : nums) {
            tillHere += num;
            if (soFar < tillHere)
                soFar = tillHere;
            if (tillHere < 0)
                tillHere = 0;
        }

        return soFar;
    }
}
```