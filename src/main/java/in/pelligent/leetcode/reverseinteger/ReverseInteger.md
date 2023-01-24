# ReverseInteger

## Intuition

Keep reducing the original by dividing by 10 and at each iteration keep creating a `reversed`. Keep checking
if `reversed` crosses MIN/MAX Integer values.

## Approach

1. Initialize a `int reversed = 0`.
2. Keep reducing `original` to 1/10<sup>th</sup> & increasing reverse by a factor of 10.
3. At every new `reversed` generated, check if the `reversed` is out of bounds of `Integer` range.

## Complexity

### Time complexity

    O(n)

### Space complexity

    O(1)

## Code

```java
class ReverseInteger {

    public int solution1(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = (reversed * 10) + (x % 10);
            x = x / 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)
                return 0;
        }

        return (int) reversed;
    }
}
```