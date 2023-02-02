package in.pelligent.leetcode.removeduplicatesfromsortedarray;

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

