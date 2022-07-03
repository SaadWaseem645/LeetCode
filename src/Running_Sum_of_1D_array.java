public class Running_Sum_of_1D_array {

    public int[] runningSum(int[] nums) {

        for(int i = 0; i < nums.length -1 ; ++i)
            nums[i+1] += nums[i];
        return nums;
    }

}
