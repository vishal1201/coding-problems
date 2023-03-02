# Shuffle String
## Intuition
Create a char array. Iterate over the length of string and get the charAt index of input string and set that to the index stored at index of indices.

## Approach
1. Create a char array of `length = s.length()` named `shuffled`.
2. Iterate over the newly created char Array.
3. Set `shuffled[indicies[i]] = s.charAt(i)`.
4. Here, extract the character at index i from the input string, then get the index that is stored at ith place of indices. This is where we are going to set the extracted character. And then set `shuffled[extracted-index] = extracted-character`.
5. Return `new String(shuffled)`. It creates a new String.

## Complexity
### Time complexity
    O(n)

### Space complexity
    O(n)

## Code
```java
class ShuffleString {
    public String solution1(String s, int[] indices) {
        char[] shuffled = new char[s.length()];
        for (int i = 0; i < shuffled.length; ++i)
            shuffled[indices[i]]=s.charAt(i);
        
        return new String(shuffled);
    }
}
```