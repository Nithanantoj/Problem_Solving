package Pattern;

public class ProgramPattern {
    public static void main(String[] args) {
        String str = "PROGRAM";

        String s1 = str + str ;

        int n = str.length();

        int mid = n/2;

        String s2 = s1.substring(mid, str.length() + mid);

        for(int i = 0; i < n; i++){
            int j =0;
            int k = 0;
            while(j <= n - (i + 2)){
                System.out.print("*");
                j++;
            }

            while(j < n){
                System.out.print(s2.charAt(k++));
                j++;
            }

            System.out.println("");
        }
    }
}
