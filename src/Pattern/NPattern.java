package Pattern;

public class NPattern {
    public static void main(String[] args) {
        patternprint("TIMEMACHINE", 4);
        patternprint("NITHANANTOJSECECSE",4);
    }

    public static void patternprint(String str, int n){

        char[][] mat = new char[n][str.length()];
        int s = 0;
        int col = 0;

        while( s < str.length()){

            for(int i = 0; i < n && s < str.length(); i++,s++){
                mat[i][col] = str.charAt(s);
            }

            for(int i = n - 2; i >= 1 && s < str.length(); i--, s++){
                mat[i][++col] = str.charAt(s);
            }
            col++;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < str.length(); j++){
                //System.out.print(mat[i][j] == '\u0000' ? "  " : mat[i][j] + " ");

                if(Character.isLetter(mat[i][j]))
                System.out.print(mat[i][j] + " ");
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
