# Count Prefixes of a Given String
## Intuition
Use String::startsWith to check if the `s` starts with `words[i]`.

## Approach
1. Initialize an integer `count = 0`.
2. Start a `foreach` loop to iterate over `words` array.
3. If string `s` starts with `word` then increment `count`.
4. Return `count`.

## Complexity
### Time complexity
    O(n)

### Space complexity
    O(1)

## Code
```java
class CountPrefixesOfAGivenString {
    public int solution1(String[] words, String s) {
        int count = 0;
        for (String word: words) {
            if (s.startsWith(word))
                count++;
        }

        return count;
    }
}
```