package Recursion;

public class nto1 {
    public static  void print5To1(int n){
        if(n==0) return ;
        System.out.print(n+"  ");
        print5To1(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        print5To1(n);
    }

}
