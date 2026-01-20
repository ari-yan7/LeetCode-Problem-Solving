class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int index = nums.length - k;
        int [] result = new int [nums.length];
        int m = 0;
        for (int i = index; i < nums.length; i++){
            result[m] = nums[i];
            m++;
        }
        for (int j = 0; j < index; j++){
            result[m] = nums[j];
            m++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
    }
}