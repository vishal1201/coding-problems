# Length of Last Word

## Intuition
Split the input string into an array using `" "` as a delimiter. Get the `(n-1)th` element and return it's length.

## Approach
1. Split input String into array, using `" "` delimiter.
2. Extract element -> `array[n - 1]` and return it's length.

## Complexity
### Time complexity
    O(n)
### Space complexity
    O(n)

## Code
```
public class LengthOfLastWord {
    public int solution1(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].trim().length();
    }
}
```