package in.pelligent.leetcode.programming.shufflestring;

class ShuffleString {
    public String solution1(String s, int[] indices) {
        char[] shuffled = new char[s.length()];
        for (int i = 0; i < shuffled.length; ++i)
            shuffled[indices[i]]=s.charAt(i);

        return new String(shuffled);
    }
}