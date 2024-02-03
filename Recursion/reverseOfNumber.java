package Recursion;

public class reverseOfNumber {
    public static int reverseNum(int n, int rev){
        if(n<=0) return rev;
        rev=rev*10+n%10;
       return reverseNum(n/10,rev);
    }
    public static void main(String[] args) {
        int n=3456;
        int rev=0;
        System.out.println(reverseNum(n,rev));
    }
}
