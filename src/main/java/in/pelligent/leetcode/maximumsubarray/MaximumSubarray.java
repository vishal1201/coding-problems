package in.pelligent.leetcode.maximumsubarray;

public class MaximumSubarray {
    public int solution1(int[] nums) {
        int soFar = Integer.MIN_VALUE;
        int tillHere = 0;
        for (int num : nums) {
            tillHere += num;
            if (soFar < tillHere)
                soFar = tillHere;
            if (tillHere < 0)
                tillHere = 0;
        }

        return soFar;
    }
}
