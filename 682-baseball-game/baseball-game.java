class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++){
            if (operations[i].equals("+")){
                int num1 = stack.pop();
                int num2 = stack.peek();
                stack.push(num1);
                stack.push(num1 + num2);
            } else if (operations[i].equals("C")){
                stack.pop();
            } else if (operations[i].equals("D")){
                stack.push(stack.peek()*2);
            } else {
                int num = Integer.parseInt(operations[i]);
                stack.push(num);
            }
        }
        int result = 0;
        for (int i : stack){
            result += i;
        }
        return result;
    }
}