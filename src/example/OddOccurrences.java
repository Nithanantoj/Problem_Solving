package example;

import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder res = new StringBuilder();

        String s = sc.nextLine();

        int[] arr = new int[256];

        for(int i = 0; i < s.length(); i++){
            if(arr[s.charAt(i)] == 1){
                arr[s.charAt(i)]--;
            }
            else{
                res.append(s.charAt(i));
                arr[s.charAt(i)]++;
            }
        }

        System.out.println(res);
    }
}
