# Grouped Anagrams
## Intuition
sort each string and use that as a key; iterate over entire string array, and keep adding string to a map where sorted key matches the current string's sorted version. return values of this map.

## Approach
1. Create a function `String sorted(String s)` that sorts an input string.
2. Initialize a Map of `String: List<String>`. We will use it to map a sortedString with a list of the anagrams of this sorted list.
3. Iterate over the input string array.
4. At each iteration, sorted the current string and check if it exists in the map. if yes, append the current string to the list of strings, else init a new list and add the current string to it and put it in the current strings's sortedstring as key.
5. Return list of map values.

## Complexity
### Time complexity
    O(n^2)

### Space complexity
    O(n)

# Code
```java
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
```