package Recursion;

public class sortedOrNot {
    public static boolean checkSort(int [] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return checkSort(arr,index+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int [] arr= {1,2,4,8,5,12};
        System.out.println(checkSort(arr,0));
    }
}
