package Searching;

public class searchInInfiteArray {
    static int binarySearch(int[] arr, int target, int start, int last){
        while(start<=last) {
            int mid = start + (last - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                last = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
    public static int ans(int[] arr, int target){
        //        we start with the size of the 2
        int start=0;
        int last=1;

//        Condition to find the target
        while(target>arr[last]){
            int temp=last+1;
            //double the box value=> last+(sizeOfBox*2)
            last=last+(last-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,last);
    }
    public static void main(String[] args) {
        int [] arr={2,3,5,6,7,8,10,12,15,23,45,67,90,97,100,102};
        int target=8;
        System.out.println(ans(arr,target));
//        getElementPosition(arr);
    }
}
