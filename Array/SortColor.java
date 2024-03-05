package Array;
public class SortColor {
    public static int[] sortColors(int[] nums) {
        int n=nums.length;
        int zero=0, one=0, two=n-1;
        while(one<=two){
            if(nums[one]==0){
                int temp=nums[one];
                nums[one]=nums[zero];
                nums[zero]=temp;
                zero++;
                one++;
            }
            else if (nums[one]==2){
                int temp=nums[one];
                nums[one]=nums[two];
                nums[two]=temp;
                two--;
            }else{
                one++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] color={2,0,2,1,1,0};
        int[] ans=sortColors(color);
    }
}
