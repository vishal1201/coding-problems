package in.pelligent.leetcode.programming.removeelement;

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
