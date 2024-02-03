package Searching;

public class firstLastOccurence {
    public static int getOccurence(int[] arr, int target, boolean FirstOccurence){
        int start=0, last=arr.length-1,ans=-1;

        while(start<=last) {
            int mid=start+(last-start)/2;
            if(arr[mid]<target) start=mid+1;
            else if(arr[mid]> target) last=mid-1;
            else {
                ans=mid;
                if(FirstOccurence){
                    last=mid-1;
                }else{
                    start=mid+1;
                }

            }
        }
        return ans;
    }
    public static  int[] getFirstLastOccurence(int[] arr, int target){
        int [] res=new int[2];
        int first=getOccurence(arr,target,true);
        int last=getOccurence(arr,target,false);
        res[0]=first;
        res[1]=last;
        return res;
    }
    public static void main(String[] args) {
        int [] arr={3,4,5,4,6,4,8,9,4,0};
        int target=4;
        getFirstLastOccurence(arr,target);
    }
}
