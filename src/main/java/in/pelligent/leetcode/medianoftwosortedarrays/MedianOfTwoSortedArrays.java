package in.pelligent.leetcode.medianoftwosortedarrays;

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
