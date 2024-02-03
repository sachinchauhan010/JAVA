package Recursion;

public class rootOfNum {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        else if (n%2!=0 || n==0) {
            return false;
        }
        else{
            return isPowerOfTwo(n/2);
        }

    }
}
