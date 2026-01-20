class Solution {
    public String removeOuterParentheses(String s) {
        Stack <Character> stack = new Stack<>();
        String result = "";
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(') {
                if (!stack.isEmpty()) {
                    result += c;
                }
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
                if (!stack.isEmpty()) {
                    result += c;
                }
            }
        }
        return result;
    }
}