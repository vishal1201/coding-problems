# Longest Common Prefix
## Intuition
Sort the input array, extract smallest string, iterate over the characters of smallest, iterate over all the input strings; if an occurence of non-matching is encountered between the current character of the smallest with the current of the iterating string, return false.

## Approach
1. Sort input array.
2. Store `smallest = strs[0];`.
3. Iterate over characters of `smallest`.
4. Iterate over input `strs`.
5. Compare `current-of-smallest` with `current-of-current-str`.
6. If found, non-matching, return `false`; else append the `current-of-smallest` to the `current-prefix`.
7. If the function makes it through the loop, return the `prefix` built so far.

## Complexity
### Time complexity
    O(n^2)

### Space complexity
    O(1)

## Code
```java
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
```