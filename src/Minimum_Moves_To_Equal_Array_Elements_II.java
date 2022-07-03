import java.util.Arrays;

public class Minimum_Moves_To_Equal_Array_Elements_II {

    public static void main(String[] args) {
        System.out.println(minMoves2(new int[] {1,0,0,6,8}));
    }

    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int med = nums[nums.length/2], steps = 0;;
        for(int num: nums)
            steps += Math.abs(num - med);
        return steps;
    }

}
