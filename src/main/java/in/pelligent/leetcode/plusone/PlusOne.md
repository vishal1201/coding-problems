# PlusOne
## Intuition
Iterate through the array; If last digit is < 9, increment the current digit & return. This makes sure if the last digit in the number is less than 9, we just need to increment and return. Even if an other number is < 9, this condition helps us to add the carry of 1 to it. If the function survives the loop, it means all numbers were 9 and hence the number is going to increase in size, by 1. So, do it, let all places, except first, be set to int's zeroed value i.e. 0.

## Approach
1. Iterate over the input array.
2. If current digit is `< 9`, increment current by 1 and return `digits`.
3. If the function survives the loop, create a new array with `size = digits.length + 1`. Set only `array[0] = 1`.

## Complexity
### Time complexity
    O(n)

### Space complexity
    O(1)

# Code
```java
class PlusOne {
    public int[] solution1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;
    }
}
```