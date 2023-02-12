package in.pelligent.leetcode.programming.reverseinteger;

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