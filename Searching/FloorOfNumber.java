package Searching;
import java.util.Scanner;
public class FloorOfNumber {

    public static int findFloorNumber(int [] arr, int n, int target){
        int  start=0, last=n-1;
        while(start<=last){
            int mid=start+(last-start)/2;

            if(arr[mid]==target) {
                return target;
            }

            else if(arr[mid]>target) {
                last=mid-1;

            }else{
                start=mid+1;
            }

        }
        return arr[last];
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int size= scan.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements in Sorted manner");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the Target");
        int target=scan.nextInt();
        System.out.println(findFloorNumber(arr,size, target));
    }
}
