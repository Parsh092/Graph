//package Leetcode_Codechef;
//
//import java.util.*;
//
//public class leetcode {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       String pattern = sc.next();
//       String s = sc.next();
//      HashMap<String, Character> b = new HashMap<>();
//      HashMap<Character,String> a = new HashMap<>();
//      String[] arr = s.split(" ");
//      if(arr.length!=pattern.length()){
//          return false;
//      }
////      for(int i=0;i<pattern.length();i++){
////          char ch = pattern.charAt(i);
////          b.put(ch,b.getOrDefault(ch,0)+1);
////      }
////
////        for(int i=0;i<s.length();i++){
////            String tem = new String();
////            while(s.charAt(i)!=' '){
////                tem=tem+s.charAt(i);
////                i++;
////            }
////            a.put(tem,a.getOrDefault(a,0)+1);
////        }
//
//        if(a.keySet().equals(b.keySet())){
//            return true;
//        }
//        else return false;
//    }
//}
