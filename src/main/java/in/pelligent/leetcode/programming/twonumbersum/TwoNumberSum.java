package in.pelligent.leetcode.programming.twonumbersum;

import java.util.HashMap;
import java.util.Map;

class TwoNumberSum {

    public int[] solution1(int[] nums, int target) {
        int[] pair = new int[2];

        Map<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (visited.containsKey(target - nums[i])) {
                pair[0] = visited.get(target - nums[i]);
                pair[1] = i;
                break;
            }
            visited.put(nums[i], i);
        }

        return pair;
    }
}
