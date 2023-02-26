package in.pelligent.leetcode.programming.jewelsandstones;

class JewelsAndStones {
    public int solution1(String jewels, String stones) {
        int stonesThatAreJewels = 0;

        for (String stone : stones.split("")) {
            if (jewels.contains(stone))
                stonesThatAreJewels++;
        }

        return stonesThatAreJewels;
    }
}