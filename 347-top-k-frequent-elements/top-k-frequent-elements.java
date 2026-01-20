import java.util.Arrays;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1) return nums;
        Arrays.sort(nums);
        int unique = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                unique++;
            }
        }
        int [] elems = new int[unique];
        int [] freq = new int[unique];
        int idx = 0;
        elems[idx] = nums[0];
        freq[idx] = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                freq[idx]++;
            } else {
                idx++;
                elems[idx] = nums[i];
                freq[idx] = 1;
            }
        }
        idx = 0;
        for (int i = 0; i < unique-1; i++) {
            idx = i;
            for (int j = i+1; j < unique; j++) {
                if (freq[idx] < freq[j]) {
                    idx = j;
                }
            }
            int tempfreq = freq[i];
            freq[i] = freq[idx];
            freq[idx] = tempfreq;
            int tempelem = elems[i];
            elems[i] = elems[idx];
            elems[idx] = tempelem;
        }
        int [] result = new int [k];
        for (int i = 0; i < k; i++) {
            result[i] = elems[i];
        }
        return result;
    }
}