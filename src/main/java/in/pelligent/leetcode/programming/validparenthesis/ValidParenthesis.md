## Intuition

Iterate over each element in the input string and if the element is an opening bracket
add it's corresponding closing in the stack. Alongside, if the stack is empty or the element at top is not the current
closing bracket, return false.

## Approach

1. Initialize a Stack of Characters
2. Iterate over input string while comparing the current character with opening brackets.
3. If `currentCharcter == Any Opening Bracket`, add it in the stack.
4. Else, if the stack if empty and we have encountered a closing bracket that doesn't equal the last closing bracket,
   then return false.
5. Ultimately, if there's any bracket left unchecked, or open, check `stack.isEmpty()`.

## Complexity

### Time complexity

    O(n)

### Space complexity

    O(n)

## Code

```java
import java.util.*;

public class ValidParenthesis {

    public boolean solution1(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
```