package Recursion;

public class productOfDigits {
    public static int productDigits(int n){
        if(n%10==n) return n;
        return ((n%10)*productDigits(n/10));
    }
    public static void main(String[] args) {
        int n=2356;
        System.out.println(productDigits(n));
    }
}
