package Recursion;

public class tiles {
    public static int tiling(int n){
        //base case
        if(n==0 || n==1) {
            return 1;
        }
        //vertical
        int fnm1 = tiling(n-1);
        //horizontal
        int fnm2 = tiling(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String[] args) {

        System.out.println(tiling(4));
    }
}
