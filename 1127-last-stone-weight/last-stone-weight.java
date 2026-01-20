import java.util.Arrays;
class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];
        int n = stones.length;
        while (true) {
            Arrays.sort(stones);
            int max = stones[n-1];
            int max2 = stones[n-2];
            if (max2 == 0) return max;
            if (max == max2) {
                stones[n-1] = 0;
                stones[n-2] = 0;
            } else {
                stones[n-1] = max - max2;
                stones[n-2] = 0;
            }
        }
    }
}