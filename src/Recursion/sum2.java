package Recursion;

import java.util.ArrayList;

public class sum2 {
    static void aps(int index, int[] s, ArrayList<Integer> arr,int sum) {
        if  (index==s.length) {
            if(sum==2)
            System.out.println(arr);
        } else {
            arr.add(s[index]);
            sum=sum+arr.get(arr.size()-1);
            aps(index + 1, s, arr,sum);
            sum=sum-arr.get(arr.size()-1);
            arr.remove(arr.size() - 1);
            aps(index + 1, s, arr,sum);
        }
        return;
    }
    public static void main(String[] args) {
        int sum=0;
        int[] s = {1,2,1,0};
        ArrayList<Integer> arr = new ArrayList<>();
        aps(0, s, arr,sum);
    }
}
