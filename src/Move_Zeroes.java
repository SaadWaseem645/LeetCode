import java.util.Arrays;

public class Move_Zeroes {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length, j = 0;
        int[] numsTwo = Arrays.copyOf(nums, nums.length);
        for(int i = 0; i < n ; i++) if (numsTwo[i] != 0) nums[j++] = numsTwo[i];
        while(j < n) nums[j++] = 0;
    }

}
