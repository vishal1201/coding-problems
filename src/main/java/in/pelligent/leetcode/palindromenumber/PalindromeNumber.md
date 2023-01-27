# PalindromeNumber
## Intuition
Reverse the current number by doing 2 operations - `mod` & `divide`. `% 10` gets the last digit, `/ 10` reduces the number by a 10th. Keep doing this iteratively and adding up the `(reverse * 10) + lastdigit` as long as current numbe is greater than zero.

## Approach
1. Backup the original number into `temp`
2. Initialize `reverse = 0`.
3. while `temp > 0` -> extract last digit by `% 10`, update `reverse = reverse * 10 + remainder`, then reduce temp as `temp /= 10`.
4. return `x == reverse`.

# Complexity
### Time complexity
    O(n)

### Space complexity
    O(1)

# Code
```java
public class PalindromeNumber {
    public boolean solution1(int x) {
        int temp = x;
        int reverse = 0;

        while (temp > 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        return x == reverse;
    }
}
```