class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prods = new int[n];
        prods[0] = 1;
        for (int i = 1; i < n; i++) {
            prods[i] = prods[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            prods[i] = prods[i] * suffix;
            suffix *= nums[i];
        }
        return prods;
    }
}