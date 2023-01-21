# Remove Element
## Intuition
Keep iterating over the input array. We move past the places which have the search key, yet, out lastest-position-index for insertion remains old. i.e. to overwrite these places; when we find that current != search-key, we increment and overwrite these places.

## Approach
1. Initialize k = 0. This shall serve to keep track of insert-index.
2. Iterate over input array.
3. If `current = search-key`, set `nums[k++] = current`, else continue to next iteration.
4. Ultimatelly return k.

# Complexity
### Time complexity
    O(n)
### Space complexity
    O(1)

## Code
```java
public class RemoveElement {
    public int solution1(int[] nums, int val) {
        int k = 0;
        for (int num : nums) {
            if (num != val)
                nums[k++] = num;
        }
        return k;
    }
}
```