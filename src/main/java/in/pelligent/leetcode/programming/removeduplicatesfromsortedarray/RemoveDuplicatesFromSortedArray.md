# Remove Duplicates From Sorted Array
## Intuition
Iterate over array copying next element in line to current as long as it is increasing. Keep tracking last non-repeating count. Return this.

## Approach
1. If `nums.length == 0 || nums.length == 1` return `nums.length` as i is either going to be empty or single-element array.
2. Initialize the returnable `k = 1`. i.e. from 2nd position of the input array.
3. Iterate over input array upto the second-last element.
4. At each iteration, check if `next > current`, and if so, copy over next in current's position, increment `k`.
5. Return `k`.

## Complexity
### Time complexity
    O(n)

### Space complexity
    O(1)

## Code
```java
public class RemoveDuplicatesFromSortedArray {
    public int solution1(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return nums.length;

        int k = 1;

        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] < nums[i + 1])
                nums[k++] = nums[i+1];
        }

        return k;
    }
}
```