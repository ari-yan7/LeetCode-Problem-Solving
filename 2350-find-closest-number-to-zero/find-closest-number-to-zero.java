class Solution {
    public int findClosestNumber(int[] nums) {
        int index = 0;
        int closetozero = Math.abs(nums[0]);
        for (int i = 0; i<nums.length; i++){
            if (Math.abs(nums[i]) < Math.abs(closetozero)){
                closetozero = nums[i];
                index = i;
            }
            if (Math.abs(nums[i]) == Math.abs(closetozero)){
                closetozero = Math.max(nums[i],nums[index]);
            }
        }
        return closetozero;
    }
}