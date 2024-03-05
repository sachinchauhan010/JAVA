package BitManipulation;

public class DivideNumbers {
    public static int divide(int a, int b) {
        if(a==Integer.MIN_VALUE  && b==-1) return Integer.MAX_VALUE;
        int sign=1;
        if((a<0)^(b<0)){
            sign=-1;
        }

        int m=Math.abs(a);
        int n=Math.abs(b);
        int count=0;

        while(m-n>=0){
           int currDivisor=n;
           int currQuotient=1;
           while(m-(currDivisor<<1)>=0){
               currDivisor=currDivisor<<1;
               currQuotient=currQuotient<<1;
           }
           count+=currQuotient;
           m-=currDivisor;
        }

        if(sign==-1){
            count=-count;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648,1));
    }
}
