package in.pelligent.leetcode.programming.howmanynumbersaresmallerthanthecurrentnumber;

import java.util.*;

class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] solution1(int[] nums) {
        Map<Integer, Integer> sortedIndexValueMap = new HashMap<>();

        int[] smallerThans = nums.clone();
        Arrays.sort(smallerThans);

        for(int i = 0; i < smallerThans.length; i++)
            sortedIndexValueMap.putIfAbsent(smallerThans[i], i);

        for(int i = 0; i < smallerThans.length; i++)
            smallerThans[i] = sortedIndexValueMap.get(nums[i]);

        return smallerThans;
    }
}