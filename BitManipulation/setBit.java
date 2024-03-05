package BitManipulation;

public class setBit {
    public static int[] leftRightDifference(int[] nums) {
        int leftSum=0,rightSum=0;
        int [] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                leftSum+=nums[i-1];
            }
            for(int j=i+1;j<nums.length;j++){
                rightSum+=nums[j];
            }
            System.out.println("Left"+leftSum);
            System.out.println("Right"+rightSum);
            res[i]=Math.abs((rightSum-leftSum));
            rightSum=0;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums={10,4,8,3};
        int [] res=leftRightDifference(nums);
        for(int i=0;i <4;i++){
            System.out.println(res[i]);
        }
    }
}
