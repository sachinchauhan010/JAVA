package Recursion;

import java.util.ArrayList;

public class arrayOfTargetIndex {
    public static ArrayList<Integer> getIndexs(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
            return getIndexs(arr,target,index+1,list);
        }else{
            return getIndexs(arr,target,index+1,list);
        }
    }
    public static void main(String[] args) {
        int [] arr= {3,5,9,2,1,0,2,29};
        int target=2;
        ArrayList <Integer> list=new ArrayList<>();
        System.out.println( getIndexs(arr,target,0,list));


    }
}
