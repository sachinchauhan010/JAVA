package Sorting;

public class Bubble {

    public static void bubbleSort(int[] arr){
        int n=arr.length;

        for(int step=0;step<n-1;step++){
            for(int i=0;i<n-step-1;i++){
               if(arr[i]>arr[i+1]){
                   int temp=arr[i];
                   arr[i]=arr[i+1];
                   arr[i+1]=temp;
               }
            }

        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
    }

    public static void main(String[] args) {
        int [] arr={3,8,78,0,2,77,-1,8,44,99,-100,100};
        bubbleSort(arr);
    }
}
