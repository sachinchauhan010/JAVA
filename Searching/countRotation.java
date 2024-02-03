package Searching;

public class countRotation {
    public static  int getPivit(int [] arr){
        int start=0, last=arr.length-1;
        while(start<=last){
            int mid=start+(last-start)/2;
//            4 cases are here
//            case1:
            if(mid<last && arr[mid]>arr[mid+1]) return mid;
//            case 2:
            if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
//            case 3:
            if(arr[mid]<=arr[start]) last=mid-1;
//            case 4:
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static int  getMinimumRotation(int[] arr){
        int peek=getPivit(arr);
        System.out.println(peek);
        return (peek!=arr.length-1) ?arr[peek+1] : arr[0];
    }
    public static void main(String[] args) {

        int[] arr={3,1,2};
        System.out.println(getMinimumRotation(arr));
    }
}
