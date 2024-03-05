package Array;

public class Difference {
    public static int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > 9) {
                while (nums[i] > 0) {
                    int rmd = nums[i] % 10;
                    digitSum += rmd;
                    System.out.println(digitSum);
                    nums[i] = nums[i] / 10;
                }
            }else{
                digitSum+=nums[i];
            }

        }
        System.out.println(sum);
        System.out.println(digitSum);
        return sum - digitSum;
    }

        public static void main(String[] args) {
            int [] arr={2,7,8,10,8,10,1,10,5,9};
            System.out.println(differenceOfSum(arr));
    }
}
