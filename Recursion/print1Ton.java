package Recursion;

public class print1Ton {
    public static void print1Ton(int n){
        if(n==0){
            return;
        }
        print1Ton(n-1);
        System.out.print(n+"  ");
    }
    public static void main(String[] args) {
        int n=10;
        print1Ton(n);
    }
}
