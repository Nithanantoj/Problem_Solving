package Pattern;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] mat = new char[n][m];

        int top = 0, bottom = n - 1, left = 0, right = m - 1;

        boolean isX = true;

        while(top < bottom && left < right){

            char ch = isX ? 'X' : '0';

            for(int i = left; i <= right; i++) mat[top][i] = ch;
            top++;

            for(int i = top; i <= bottom; i++) mat[i][right] = ch;
            right--;

            for(int i = right; i >= left; i--) mat[bottom][i] = ch;
            bottom--;

            for(int i = bottom; i >= top; i--) mat[i][left] = ch;
            left++;

            isX = !isX;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
