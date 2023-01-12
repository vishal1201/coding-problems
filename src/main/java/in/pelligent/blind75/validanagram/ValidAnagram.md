# Valid Anagram

## Intuition

Creating a map of occurrences and checking if the occurrences differ for both the strings should yield the result.

## Approach

1. Check if lengths of both strings aren't equal. If so, then return false as it won't make sense to check otherwise as
   the occurences of the elements within the string are not the same.
2. We will create 2 countMaps i.e. Map of Characters in Strings with the occurences. Hence, we create &
   populate `sMap, tMap` for `String s, String t` respectively.
3. Now all we have to do is, check if the occurences of characters in 1 map equals the occurences in the other map. We
   can do this by iterating over 1 Map and checking everytime if
   the `occurence of current character in Map 1 != occurence of current character in Map 2`. `return false` at the first
   such encounter.
4. If the function survives past the loop, it means all the occurences match in both the strings. Hence, `return true`

## Complexity

### Time complexity:

      O(2s + t)

### Space complexity:

      O(s) + O(t)

## Code

```java
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

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
```