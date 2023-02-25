package in.pelligent.leetcode.programming.countprefixesofagivenstring;

class CountPrefixesOfAGivenString {
    public int solution1(String[] words, String s) {
        int count = 0;
        for (String word: words) {
            if (s.startsWith(word))
                count++;
        }

        return count;
    }
}