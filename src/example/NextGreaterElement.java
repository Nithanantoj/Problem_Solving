package example;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 7, 4, 6, 8};

        int[] res = nextGreaterElement(arr);

        for(int num : res){
            System.out.print(num + " ");
        }
    }

    public static int[] nextGreaterElement(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int n = arr.length - 1;

        for(int i = n; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            res[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);
        }

        return res;
    }
}
