# Jewels and Stones
## Intuition
Iterate over the `stones` string, and for each character, check if that exists in the `jewels` string.

## Approach
1. Initialize an integer `stonesThatAreJewels`.
2. Start a `foreach` loop that iterates over each String in the array returned by `stone.split("")`
3. If `jewels.contains(stone)`, then increment `stonesThatAreJewels`.
4. return `stonesThatAreJewels`.

## Complexity
### Time complexity
    O(n)

### Space complexity
    O(1)

## Code
```java
import java.util.*;

class JewelsAndStones {
    public int solution1(String jewels, String stones) {
        int stonesThatAreJewels = 0;

        for (String stone : stones.split("")) {
            if (jewels.contains(stone))
                stonesThatAreJewels++;
        }

        return stonesThatAreJewels;
    }
}
```