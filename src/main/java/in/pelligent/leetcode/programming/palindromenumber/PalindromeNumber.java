package in.pelligent.leetcode.programming.palindromenumber;

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
