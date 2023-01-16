package in.pelligent.leetcode.missingnumber;

import java.util.Arrays;

public class MissingNumber {

    public int solution1(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for (i = 0; i < nums.length; ++i) {
            if (i != nums[i])
                return i;
        }

        return i;
    }
}
