class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) return true;
        String s1 = s.toLowerCase().replaceAll("[\\s\\p{Punct}]", "");
        for (int i = 0, j = s1.length()-1; i < s1.length()/2; i++, j--) {
            if (s1.charAt(i) != s1.charAt(j)) return false;
        }
        return true;
    }
}