# GreatestEnglishLetterInUpperCase
## Intuition
Iterate from `Z` to `A` and return the current character if input string contains it as well as it contains lower-case version of it.

## Approach
1. Start a loop from `Z` to `A`.
2. Do 2 checks - `s.indexOf(currentChar) != -1` and `s.indexOf(Character.toLowerCase(currentChar)) != -1)`.
3. This makes sure the input string contains both lower & upper case variants of the current-character.
4. Return if the condition matches; else outside the loop, return an empty string.

## Complexity
### Time complexity
    O(n)

### Space complexity
    O(1)

## Code
```java
class Solution {
    public class GreatestEnglishLetterInUpperCase {
        public String solution1(String s) {
            for (char ch='Z'; ch>='A'; ch--) {
                if((s.indexOf(ch) != -1) && (s.indexOf(Character.toLowerCase(ch)) != -1))
                    return String.valueOf(ch);
            }
            return "";
        }
    }
}
```