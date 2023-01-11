package in.pelligent.blind75.containsduplicate;

import java.util.Arrays;

public final class ContainsDuplicate {
    public static boolean solution1(int[] nums) {
        if (nums.length == 0)
            return false;

        Arrays.sort(nums);
        int previous = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            if (previous == nums[i])
                return true;
            previous = nums[i];
        }

        return false;
    }
}
