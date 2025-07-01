package example;

public class SmallestLetterFinder {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};

        System.out.println(nextGreatestLetter(letters, 'a')); // Output: c
        System.out.println(nextGreatestLetter(letters, 'j')); // Output: c
        System.out.println(nextGreatestLetter(letters, 'c')); // Output: f
    }

    public static char nextGreatestLetter(char[] letters, char ch){
        int low = 0;
        int high = letters.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(letters[mid] <= ch){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return letters[low % letters.length];
    }
}
