class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(stack.peek() == s.charAt(i)){
                stack.push(s.charAt(i));
            }else if(stack.peek() == (char)(s.charAt(i) + 32)){
                stack.pop();
            }else if(stack.peek() == (char)(s.charAt(i) - 32)){
                stack.pop();
            }else if(!stack.isEmpty()){
                stack.push(s.charAt(i));
            }
        }

        StringBuilder str = new StringBuilder();

        while(!stack.isEmpty()){
            str.append(stack.pop());
        }

        String ans = str.reverse().toString();
        return ans;
    }
}