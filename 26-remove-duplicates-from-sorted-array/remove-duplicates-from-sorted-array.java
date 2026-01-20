class Solution {
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        if (l == 0){
            return 0;
        }
        int count = 1;
        for (int i = 1; i < l; i++){
            if (nums[i] != nums[count-1]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}