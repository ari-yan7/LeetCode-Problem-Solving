class Solution {
    public String reversePrefix(String word, char ch) {
        int index = -1;
        String result = "";
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == ch){
                index = i;
                break;
            }
        }
        if (index == -1){
            return word;
        }
        Stack <Character> stack = new Stack<>();
        for (int i = 0; i <= index; i++){
            stack.push(word.charAt(i));
        }
        while (!stack.isEmpty()){
            result += stack.pop();
        }
        if (index + 1 < word.length()){
            result += word.substring(index + 1);
        }
        return result;
    }
}