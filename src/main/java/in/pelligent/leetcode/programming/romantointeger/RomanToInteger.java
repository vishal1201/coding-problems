package in.pelligent.leetcode.programming.romantointeger;

import java.util.*;

class RomanToInteger {
    public int solution1(String s) {
        int sum = 0;

        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        for (int i = 0; i < s.length(); ++i) {
            int current = Integer.parseInt(romans.get(s.charAt(i)).toString());
            if ((i+1 < s.length()) && (current < Integer.parseInt(romans.get(s.charAt(i+1)).toString()))) {
                current = -current;
            }

            sum += current;
        }

        return sum;
    }
}