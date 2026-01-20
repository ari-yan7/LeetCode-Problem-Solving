class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++){
            int currentcount = 1;
            for (int j = i+1; j < nums.length; j++){
                if (nums[j] == nums[i]){
                    currentcount++;
                }
            }
            if (count < currentcount){
                count = currentcount;
                num = nums[i];
            }
        }
        return num;
    }
}