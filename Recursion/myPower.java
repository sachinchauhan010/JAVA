package Recursion;

public class myPower {
    static double res=1;
    public static void main(String[] args) {
        double x=2.1;
        int n=3;
        double res=1;
        System.out.println(myPow(x,n));

    }
    public static double myPow(double x, int n){
        if(n==0) return 1;
        res=res*x;
        myPow(x,n-1);
        return res;
    }
}
