package in.pelligent.leetcode.jumpgame;

public class JumpGame {
    public static boolean solution1(int[] nums) {
        int lastReach = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= lastReach)
                lastReach = i;
        }

        return (lastReach == 0);
    }
}



