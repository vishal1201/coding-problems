# Roman to Integer
## Intuition
Maintain a map of all the Romans against respective integer values. Iterate over the Roman String keep adding current roman's integer representation, unless the next roman is less than current. At this case, subtract current.

## Approach
1. Initialize a placeholder `int sum = 0`.
2. Define a map of Roman with their Integer representations.
3. Iterate over input string.
4. At each iteration check if next element is within string's length bound and if the next element is greater than current element's integer representation. This is case where current is subtracted from the sum.
5. Else `sum += current`
6. Ultimately return `sum`.

## Complexity
### Time complexity
    O(n)
### Space complexity
    O(1)

## Code
```java
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
```