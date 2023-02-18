# Find the Index of the First Occurrence in a String
## Intuition
String class has a method `indexOf(String str)` which returns the first occurence of the input string or -1 in case of absence.

## Approach
1. Return `haystack.indexOf(needle)`.

## Complexity
#### Time complexity
    O(1)

#### Space complexity
    O(1)

## Code
```java
class FindTheIndexOfTheFirstOccurrenceInAString {
    public int solution1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
```