package Recursion;

public class Longest_Common_Subsequence {
    static int lcs(int i,int j,String a,String b){
        if(i== a.length() || j==b.length()){
            return 0;
        }
        if(a.charAt(i)==b.charAt(j)){
            return 1+lcs(i+1,j+1,a,b);
        }
        return Math.max(lcs(i+1,j,a,b),lcs(i,j+1,a,b));
    }
    public static void main(String[] args) {
        String text1="pmjghexybyrgzczy";
        String text2 ="hafcdqbgncrcbihkd";
        System.out.println( lcs(0,0,text1,text2));
    }

}
