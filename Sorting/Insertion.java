package Sorting;

public class Insertion {
    public static void InsertionSort(int [] arr){
        int n=arr.length;

        for(int step=1;step<n;step++){
            int key=arr[step];
            int i=step-1;
          while(i>=0 && key<arr[i]){
              arr[i+1]=arr[i];
              --i;
          }
          arr[i+1]=key;

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[] args) {
        int [] arr= {23,34,6,78,23,78,0,9};
        InsertionSort(arr);
    }
}
