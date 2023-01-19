# Median of Two Sorted Arrays

## Intuition
Merge both arrays and sort them and then find the element at the middle.

## Approach
1. Initialize an array with `length = array1.length + array2.length`
2. Run 2 loops - 1 for adding elements of array1, 2 for adding elements of array2, in the new array.
3. If `return array[array.length / 2] if array.length % 2 == 0 else array[array.length / 2 - 1]`

## Complexity
### Time complexity
    O(m+n)
### Space complexity
    O(m+n)

# Code
```java
import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public double solution1(int[] nums1, int[] nums2) {
        int[] numbers = new int[nums1.length + nums2.length];
        int index = 0;
        for (int i = 0; i < nums1.length; ++i)
            numbers[index++] = nums1[i];

        for (int i = 0; i < nums2.length; ++i)
            numbers[index++] = nums2[i];

        Arrays.sort(numbers);

        return index % 2 == 0 ? (double) (numbers[index / 2 - 1] + numbers[index / 2]) / 2 : (double) numbers[index / 2];
    }
}
```