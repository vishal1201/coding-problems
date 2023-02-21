package in.pelligent.leetcode.programming.majorityelement;

import java.util.*;

class MajorityElement {
    public int solution1(int[] nums) {
        Arrays.sort(nums);
        return nums[(nums.length - 1) / 2];
    }
}