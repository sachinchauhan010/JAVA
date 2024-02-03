package Sorting;

public class MissingNum {
    public static int getmissedElement(int[] arr){

        int n=arr.length;

        int i=0;
        while(i<n){
            int correct=arr[i];
            if(arr[i]<n && arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }

        // case1: search element is missing between
        for(int j=0;j<n;j++){
            if(arr[j]!=j) return j;
        }

//
        return n;

    }


    public static void main(String[] args) {
        int [] arr={3,0,1};
        System.out.println(getmissedElement(arr));
    }
}
