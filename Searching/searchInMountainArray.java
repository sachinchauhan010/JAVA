package Searching;

public class searchInMountainArray {
    public static int getPeekElement(int[] arr){
        int n=arr.length;
        int start=0, last=n-1;

        while(start<last){
            int mid=start+(last-start)/2;

            if(arr[mid]<arr[mid+1]){
//                You are in increasing left array this may be ans but look in right
                start=mid+1;
            }else if(arr[mid]>arr[mid+1]){
//                You are in decresing right array this may be ans but look in left
                last=mid;
            }
        }
        return start;
    }
    public static int countTargetIncreasing(int[] arr, int target,int start,int last){
        int count=0;
        while(start<=last){
            int mid=(start+last)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            if (arr[mid]>target){
                last=mid-1;
            }
            if(arr[mid]==target){
                count++;
            }
        }
        return count;
    }

    public static int countTargetDeccreasing(int[] arr, int target,int start,int last){
        int count=0;
        while(start<=last){
            int mid=start+(last-start)/2;
            if(arr[mid]<target){
                last=mid-1;
            }else if (arr[mid]>target){
                start=mid+1;
            }else{
                count++;
            }
        }
        return count;
    }

    public static  int getElementInMountain(int[] arr, int target){
        int peek=getPeekElement(arr);
        int countLeft=countTargetIncreasing(arr,target,0,peek-1);
//        int countRight=countTargetDeccreasing(arr,target,peek, arr.length-1);

        return countLeft;

    }
    public static void main(String[] args) {
        int [] arr={2,3,4,6,3,2,1};
        int target=3;

        System.out.println(getElementInMountain(arr, target));
    }
}
