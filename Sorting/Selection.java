

package Sorting;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

//import static Sorting.Selection.selectionSort;

public class Selection {
    public static void main(String[] args) {
        int [] arr= {23,34,6,78,23,-90,78,0,-9,9};
        SelectionSort(arr);
    }

    public static void SelectionSort(int [] arr){
        int n=arr.length;

        for(int step=0;step<n;step++){
            int smallestIndx=step;
            for(int i=step;i<n;i++){
                if(arr[smallestIndx]>arr[i]){
                    smallestIndx=i;
                }
            }
            int temp=arr[step];
            arr[step]=arr[smallestIndx];
            arr[smallestIndx]=temp;
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+"  ");
            }
            System.out.println();
        }


        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
    }

}
