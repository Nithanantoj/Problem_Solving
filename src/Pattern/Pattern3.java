package Pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        for(int i = 0; i< n ; i++){
            for(int j = 0; j < n; j++){
                int min = Math.min(Math.min(i, j),Math.min(n - 1 - i, n- 1- j));

                System.out.print(n - min);
            }

            System.out.println();
        }

    }
}
