package example;

public class StringTransformer {
    public static void main(String[] args) {
        String input1 = "CHOCOCAKE";
        String input2 = "ICECREAM";

        System.out.println("Output for Case 1: " + transform(input1));
        System.out.println("Output for Case 2: " + transform(input2));
    }

    public static String transform(String input){
        StringBuilder str = new StringBuilder();
        int n = input.length();

        for(int i = 0; i<n;i++){
            char ch = input.charAt(i);
            char transformedChar =(char)(ch + i);

            if(transformedChar > 'Z') {
                transformedChar = (char) ('A' + (transformedChar - 'Z' - 1));
            }

            str.append(transformedChar);

        }

        return str.toString();
    }
}
