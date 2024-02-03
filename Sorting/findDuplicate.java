package Sorting;

import java.util.List;

public class findDuplicate {
    public  static int findDuplicate(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
//                swap
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]-1!=j){
                return arr[j];
            }
        }
        return -1;
    }

    public static void main(String[] args) {


    int[] arr={1,3,4,2,2};
        System.out.println(findDuplicate(arr));

    }
}
