package Sorting;



public class Cycle {
//    When Nmber are given in range 1 to n : use cyclic Sort
//    After Sorting: index=value-1
     public static void cycleSort(int[] arr,int n){
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
         for(int j=0;j<n;j++){
             System.out.print(arr[j]+"  ");
         }

    }
    public static void main(String[] args) {
        int[] arr={3,5,1,2,4};
        int n=5;
        cycleSort(arr,n);
    }
}
