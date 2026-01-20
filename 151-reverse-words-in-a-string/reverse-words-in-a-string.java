import java.util.*;
class Solution {
    public String reverseWords(String s) {
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            String current = "";
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    break;
                }
                current += s.charAt(j);
                i = j;
            }
            if (!current.isEmpty()) {
                words.add(current);
            }
        }
        String result = "";
        for (int i = words.size() - 1; i >= 0; i--) {
            result += words.get(i);
            if (i > 0) {
                result += " ";
            }
        }
        return result;
    }
}