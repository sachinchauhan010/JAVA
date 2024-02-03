package Recursion;

public class printNumber {
    public static void main(String[] args) {
        print(1);
    }

    public static void print(int n){
        if(n>5){
            return;
        }
        System.out.print(n);
        print(n+1);
    }


}
