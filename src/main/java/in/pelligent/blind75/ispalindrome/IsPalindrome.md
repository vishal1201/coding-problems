# IsPalindrome

## Intuition

Keep building a string say `no_special_chars_string` by iterating over the input string. At every if the character is
character is letter/digit, add it in `no_special_chars_string`.
Finally, reverse `no_special_chars_string` and compare the reverse with original.

## Approach

1. Initialize a StringBuilder to builder our `no_special_chars_string`.
2. At every iteration check if the character `isLetterOrDigit`.
3. If the condition matches, then add the character to the StringBuilder.
4. Once iteration completes, reverse `no_special_chars_string` and compare each other; if `equals`, return `true`,
   else `false`.

## Complexity

### Time complexity:

    O(n)

### Space complexity:

    O(n)

## Code

```java
class Solution {
    public boolean isPalindrome(String s) {
        if (s.strip().length() < 2)
            return true;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                builder.append(s.charAt(i));
        }

        String strippedString = builder.toString().toLowerCase();
        String reversed = builder.reverse().toString().toLowerCase();

        return reversed.equals(strippedString);
    }
}
```