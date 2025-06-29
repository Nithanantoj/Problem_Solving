package Searching;



public class Linear {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 8, 3, 9, 24, 56};
        int target = 24;

        System.out.println(LinearHelper(arr, target));
    }

    private static int LinearHelper(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target)
                return i;
        }

        return -1;
    }
}
