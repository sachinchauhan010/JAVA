package BitManipulation;

public class findUnique {
    public static int getUnique(int[] arr){
        int n=arr.length;
        int res=0;
        for(int e: arr){
            res=res^e;
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr ={2,3,2,5,4,6,4,3};
        System.out.println(getUnique(arr));
    }
}
