# Search Insert Position
## Intuition
Return current element's index if current element is `>=` target. If not returned after iterating entire array, return length of the input array as the position as it will be inserted at the end.

## Approach
1. Iterate over array.
2. Check if `current >= target`.
3. If yes, return `index`, else continue.
4. If the function survives the loop, return input array's length.

## Complexity
### Time complexity
    O(n)

### Space complexity
    O(1)

# Code
```java
class SearchInsertPosition {
    public int solution1(int[] nums, int target) {

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] >= target)
                return i;            
        }

        return nums.length;
    }
}
```