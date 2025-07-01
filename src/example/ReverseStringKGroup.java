package example;

import java.util.Scanner;

public class ReverseStringKGroup {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));       // Output: "bacdfeg"
        System.out.println(reverseStr("abcdefghij", 3));    // Output: "cbadefihgj"
        System.out.println(reverseStr("abcdefghijk", 4));   // Output: "dcbaefghkji"
    }

    public static String reverseStr(String s, int k){
        char[] ch = s.toCharArray();
        int n = ch.length;

        for(int i = 0; i < n ; i += 2 * k){
            int start = i;
            int end = Math.min(i + k - 1, n - 1);

            while(start < end){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }

        return new String(ch);
    }
}
