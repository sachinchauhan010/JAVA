package Searching;

public class SearchInRotatedSortedArray {

    public static  int binarySaerch(int[] arr,int target, int start, int last){
        while(start<=last) {
            int mid=start+(last-start)/2;
            if(target>arr[mid]) start=mid+1;
            if(target<arr[mid]) last=mid-1;
            if(target==arr[mid]) return mid;
        }
        return -1;
    }
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

    public static int getElement(int[] arr, int target){
        int pivit=getPivit(arr);
        int left=binarySaerch(arr,target,0,pivit);
        int right=binarySaerch(arr,target,pivit+1,arr.length-1);
        return (left == -1) ? right : left;
    }
    public static void main(String[] args) {

        int[] arr={4,5,6,7,0,1,2};
        int target=2;

        System.out.println(getElement(arr,target));
    }
}
