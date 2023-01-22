package in.pelligent.leetcode.lengthoflastword;

public class LengthOfLastWord {
    public int solution1(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].trim().length();
    }
}
