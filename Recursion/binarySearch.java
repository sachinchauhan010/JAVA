package Recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr={2,34,78,89,99,200,203};
        int target=78;
        int last=arr.length-1;
        System.out.println(binarySearch(arr,0,last,target));
    }

    public static int binarySearch(int[] arr, int start, int last, int target){
        if(start>last) return -1;
        int mid=start+(last-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if (arr[mid]<target) {
            return binarySearch(arr,mid+1,last,target);
        }
        if (arr[mid]>target){
            return binarySearch(arr,start,mid-1,target);
        }
        return -1;
    }
}
