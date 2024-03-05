package Recursion;

public class SearchElement {
    public static int getElement(int[] arr, int target,int index){
//        Base Condition
        if(index==arr.length){
            return -1;
        }
//        Condition that must be satisfied
        if(arr[index]==target){
            return index;
        }else{
            return getElement(arr,target,index+1);
        }

    }
    public static void main(String[] args) {
        int [] arr={4,6,1,56,90};
        int target=1;
        System.out.println(getElement(arr,target,0));
    }
}
