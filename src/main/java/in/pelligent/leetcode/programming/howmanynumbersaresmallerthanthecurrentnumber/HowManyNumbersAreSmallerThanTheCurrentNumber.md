# How Many Numbers Are Smaller Than the Current Number
## Intuition
Clone the input array, sort, the map `element:index`. Once sorted, each index is actually the number of elements that are smaller than the current. update smallerThans with the corresponding indexes from map.

## Approach
1. Initialize a `HashMap sortedIndexValueMap`.
2. Clone input array.
3. Populate the map as `element:index`.
4. Replace element at index `i` in input-array-copy, with `sortedIndexValueMap.get(nums[i])`.
5. Return input-array-copy.

## Complexity
### Time complexity
    O(log(N) + 2N)

### Space complexity
    O (N)

## Code
```java
import java.util.*;

class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] solution1(int[] nums) {
        Map<Integer, Integer> sortedIndexValueMap = new HashMap<>();

        int[] smallerThans = nums.clone();
        Arrays.sort(smallerThans);

        for(int i = 0; i < smallerThans.length; i++)
            sortedIndexValueMap.putIfAbsent(smallerThans[i], i);

        for(int i = 0; i < smallerThans.length; i++)
            smallerThans[i] = sortedIndexValueMap.get(nums[i]);

        return smallerThans;
    }
}
```