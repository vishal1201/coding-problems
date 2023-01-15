package in.pelligent.leetcode.validanagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class ValidAnagram {
    public boolean solution1(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<String, Integer> sMap = new HashMap<>();
        Map<String, Integer> tMap = new HashMap<>();

        for (String ch : s.split("")) {
            Integer count = sMap.get(ch);
            if (!sMap.containsKey(ch))
                count = 0;
            sMap.put(ch, ++count);
        }

        for (String ch : t.split("")) {
            Integer count = tMap.get(ch);
            if (!tMap.containsKey(ch))
                count = 0;
            tMap.put(ch, ++count);
        }

        for (Entry entry : sMap.entrySet()) {
            if (!entry.getValue().equals(tMap.get(entry.getKey())))
                return false;
        }

        return true;
    }
}