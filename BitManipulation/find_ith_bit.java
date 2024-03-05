package BitManipulation;

public class find_ith_bit {
    public static int getIthBit(int n, int i){
        int mask=1<<i-1;

        int temp= n&mask;
        return temp>>i-1;
    }
    public static void main(String[] args) {
        int n=11;
        int i=3;
        System.out.println(getIthBit(n,i));
    }
}
