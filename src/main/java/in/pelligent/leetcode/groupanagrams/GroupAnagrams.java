package in.pelligent.leetcode.groupanagrams;

import java.util.*;

class GroupAnagrams {

    public static String sorted(String inputString)
    {
        char[] tempArray = inputString.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }

    public List<List<String>> solution1(String[] strs) {

        Map<String, List<String>> groupedStrs = new HashMap<>();

        for (String str: strs) {
            String sortedStr = sorted(str);
            List<String> currentGroup = groupedStrs.getOrDefault(sortedStr, new ArrayList<String>());
            currentGroup.add(str);
            groupedStrs.put(sortedStr, currentGroup);
        }

        return new ArrayList<>(groupedStrs.values());
    }
}
