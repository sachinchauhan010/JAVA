package Recursion;

public class Pailndrome {
    public static int reverseNum(int n, int rev){
        if(n<=0) return rev;
        rev=rev*10+n%10;
        return reverseNum(n/10,rev);
    }
    public static boolean isPailndrome(int n){
        return n==reverseNum(n,0);
    }
    public static void main(String[] args) {
        int n=1221;
        System.out.println(isPailndrome(n));
    }
}
