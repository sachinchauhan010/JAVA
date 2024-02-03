package Recursion;

public class productnTo1 {

    public static int  productnTo1(int n){
        if(n==1) return 1;
        return (n*productnTo1(n-1));
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(productnTo1(n));
    }
}
