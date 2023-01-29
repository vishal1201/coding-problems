package in.pelligent.leetcode.longestcommonprefix;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String solution1(String[] strs) {
        Arrays.sort(strs);
        String smallest = strs[0];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < smallest.length(); ++i) {
            char current = smallest.charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != current)
                    return builder.toString();
            }
            builder.append(current);
        }

        return builder.toString();
    }
}
