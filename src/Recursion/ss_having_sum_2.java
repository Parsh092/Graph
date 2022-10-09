package Recursion;

import java.util.ArrayList;

public class ss_having_sum_2 {
    static boolean aps(int index, int[] s, ArrayList<Integer> arr, int sum) {
        if (index == s.length) {
            if (sum == 2) {
                System.out.println(arr);
                return true;
            } else {
                return false;
            }
        } else {
            arr.add(s[index]);
            sum = sum + arr.get(arr.size() - 1);
            if (aps(index + 1, s, arr, sum) == true) {
                return true;
            }
            sum = sum - arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
           if(aps(index + 1, s, arr, sum) == true){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int sum = 0;
        int[] s = {1, 2, 1, 0};
        ArrayList<Integer> arr = new ArrayList<>();
        boolean a = aps(0, s, arr, sum);
        System.out.println(a);
    }
}
