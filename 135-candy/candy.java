class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if (n == 1) return 1;
        int [] right = new int [n];
        int [] left = new int [n];
        for (int i = 0; i < n; i++) {
            right[i] = 1;
            left[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            int curr = ratings[i];
            int prev = ratings[i-1];
            if (curr > prev) {
                right[i] = right[i-1] + 1;
            }
        }
        for (int i = n-2; i >= 0; i--) {
            int curr = ratings[i];
            int next = ratings[i+1];
            if (curr > next) {
                left[i] = left[i+1] + 1;
            }
        }
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += Math.max(right[i], left[i]);
        }
        return total;
    }
}