package Recursion;

class findfibonacci{
    static int findnum(int n){
        if(n<=1){
            return n;
        }
        int last = findnum(n-1);
        int lastsecond = findnum(n-2);
        return last+lastsecond;
    }
}
public class fibonacci {
    public static void main(String[] args) {
        int n=4;
         findfibonacci f= new findfibonacci();
         int ans = findfibonacci.findnum(n);
        System.out.println("The "+n+"th term in fibonacci series is "+ans);

    }
}
