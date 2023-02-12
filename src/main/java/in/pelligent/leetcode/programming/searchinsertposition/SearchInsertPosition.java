package in.pelligent.leetcode.programming.searchinsertposition;

public class SearchInsertPosition {
    public int solution1(int[] nums, int target) {

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] >= target)
                return i;
        }

        return nums.length;
    }
}
