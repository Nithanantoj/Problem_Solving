package Searching;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        System.out.println(BinaryHelper(arr, target));
    }

    public static int BinaryHelper(int[] arr, int target){
        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] < target){
                low = mid + 1;
            }else if(arr[mid] > target){
                high = mid - 1;
            }else{
                return mid;
            }
        }

        return -1;

    }
}
