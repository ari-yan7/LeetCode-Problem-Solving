class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length()-1;
        for (int j = i; i >= 0;i--){
            if (s.charAt(i)==' ' && count == 0){
                
            } else if (s.charAt(i)==' ' && count != 0){
                break;
            } else {
                count++;
            }
        }
        return count;
    }
}