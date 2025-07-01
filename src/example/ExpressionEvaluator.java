package example;

import java.util.Stack;

public class ExpressionEvaluator {
    public static void main(String[] args) {
        String exp = "12+3*4";

        System.out.println(evaluate(exp));
    }

    public static int evaluate(String exp){
        Stack<Integer> st = new Stack<>();
        int sign = '+';

        int num = 0;

        for(int i = 0; i < exp.length(); i++){
            int ch = exp.charAt(i);

            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            }

            if(!Character.isDigit(ch) || i == exp.length() - 1){
                switch (sign) {
                    case '+':
                        st.push(num);
                        break;
                    case '-':
                        st.push(-num);
                        break;
                    case '*':
                        st.push(st.pop() * num);
                        break;
                    case '/':
                        st.push(st.pop() / num);
                        break;
                }
                sign =ch;
                num = 0;
            }


        }

        int res = 0;
        while (!st.isEmpty()){
            res += st.pop();
        }

        return res;
    }
}
