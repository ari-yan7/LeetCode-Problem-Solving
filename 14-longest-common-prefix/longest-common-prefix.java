class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        String common = strs[0];
        for (int i = 1; i < strs.length; i++){
            String current = "";
            int minLength = Math.min(common.length(), strs[i].length());
            for (int j = 0; j < minLength; j++){
                if (common.charAt(j) == strs[i].charAt(j)){
                    current+=common.charAt(j);
                } else {
                    break;
                }
            }
            common = current;
            if (common.isEmpty()){
                return "";
            }
        }
        return common;
    }
}