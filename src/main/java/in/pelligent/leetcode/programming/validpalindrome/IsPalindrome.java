package in.pelligent.leetcode.programming.validpalindrome;

public class IsPalindrome {

    public boolean solution1(String s) {
        if (s.strip().length() < 2)
            return true;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                builder.append(s.charAt(i));
        }

        String strippedString = builder.toString().toLowerCase();
        String reversed = builder.reverse().toString().toLowerCase();

        return reversed.equals(strippedString);
    }
}
