package Searching;

public class peakIndexMaountainArray {

    public static int getPeekElement(int[] arr){
        int n=arr.length;
        int start=0, last=n-1;

        while(start<last){
            int mid=start+(last-start)/2;


            if(arr[start]<arr[mid]) { //If left array is sorted
                if (arr[mid] < arr[mid + 1]) {
//                You are in increasing left array this may be ans but look in right
                    start = mid + 1;
                } else if (arr[mid] > arr[mid + 1]) {
//                You are in decresing right array this may be ans but look in left
                    last = mid;
                }
            }else{

            }
        }
        return start;
    }
    public static void main(String[] args) {
        int [] arr={3,1,2};
        System.out.println(getPeekElement(arr));
    }
}
