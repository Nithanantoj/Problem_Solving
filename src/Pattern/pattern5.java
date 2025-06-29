package Pattern;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i= 1; i <= n; i++){
            for(int s = 1; s <= n - i; s++){
                System.out.print(" ");
            }
            for (int e = n - i + 1; e <= n; e++){
                System.out.print(i + " ");
            }

            System.out.println();
        }

        for(int i = n - 1; i >= 1; i--){
            for(int s = 1; s <= n - i; s++){
                System.out.print(" ");
            }
            for (int e = n - i; e <= n - 1; e++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

