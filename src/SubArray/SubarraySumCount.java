package SubArray;

import java.util.*;

public class SubarraySumCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int K = sc.nextInt();

        int X = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        int i = 0;
        while (i < N) {
            arr.add(sc.nextInt());
            i++;
        }

        int j = 0;
        while (i < N * K) {
            arr.add(arr.get(j));
            j++;
            i++;
        }

        //System.out.println(arr);

        System.out.println(helper(X, arr));

    }

    public static int helper(int X, List<Integer> ls) {
        Set<List<Integer>> set = new HashSet<>();

//        for (int i = 0; i < ls.size(); i++) {
//            for (int j = 0; j < ls.size(); j++) {
//                List<Integer> ls1 = new ArrayList<>();
//                int sum = 0;
//                for (int k = i; k <= j; k++) {
//                    ls1.add(ls.get(k));
//                    sum += ls.get(k);
//
//                }
//
//                if (sum >= X) {
//                    System.out.println(ls1 + " " + sum);
//                    set.add(ls1);
//                }
//            }
//        }

        for(int start = 0; start < ls.size(); start++){
            Set<Integer> seen = new HashSet<>();
            int sum = 0;
            List<Integer> curr = new ArrayList<>();

            for(int end = start; end < ls.size(); end++){
                if(seen.contains(ls.get(end))) break;

                curr.add(ls.get(end));
                seen.add(ls.get(end));
                sum += ls.get(end);

                if(sum >= X) {

                    set.add(new ArrayList<>(curr));
                    //System.out.println(curr + " " + sum +" " + set.size());
                }
            }
        }

        return set.size();
    }
}
