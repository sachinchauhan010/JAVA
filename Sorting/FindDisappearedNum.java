package Sorting;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNum {
    public static List<Integer> findDisappearedNumbers(int[] arr) {

//        int n=arr.length;
//        int i=0;
//
//        while(i<n){
//            int correct=arr[i]-1;
//            if(arr[i]!=arr[correct]){
//
//                int temp=arr[i];
//                arr[i]=arr[correct];
//                arr[correct]=temp;
//            }else{
//                i++;
//            }
//        }
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


        List<Integer> res = new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]-1!=j){
                res.add(j+1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
