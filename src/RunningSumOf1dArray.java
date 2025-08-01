import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/description/
public class RunningSumOf1dArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    private static int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                res[i] = nums[i];
            } else {
                res[i] = res[i-1] + nums[i];
            }
        }

        return res;
    }
}
