package BitManipulation;

public class oddOrEven {
    public static void oddEven(int num){
        if((num & 1)==1){
            System.out.println("Odd Number");
        }else{
            System.out.println("Even Number");
        }
    }
    public static void main(String[] args) {
        int num=11;
        oddEven(num);
    }
}
