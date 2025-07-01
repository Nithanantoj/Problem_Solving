package example;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = "((())()";
        String s2 = "((())())";
        System.out.println(longestValidParentheses(s));
        System.out.println(longestValidParentheses(s2));
    }

    public static int longestValidParentheses(String s){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLen = 0;

        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);

            if(ch =='('){
                st.push(i);
            }else{
                st.pop();

                int len = i - st.peek();
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}
