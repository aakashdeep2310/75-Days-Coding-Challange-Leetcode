class Solution {
    public int minSwaps(String s) {
        // Stack<Character> stack = new Stack<Character>();
        int open = 0;
        int close = 0;
        for(int i = 0;i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '['){
                // stack.push(ch);
                open++;
            }else{
                // if(stack.isEmpty() || stack.peek() == ']'){
                if(open <= 0){
                    // stack.push(ch);
                    close++;
                }else{
                    open--;
                    // stack.pop();
                }
            }
        }
        // int totalBrackets = stack.size();
        // int closedBrackets = totalBrackets / 2;
        // return (closedBrackets+1)/2;
        return (close+1)/2;
    }
}
