import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Combination_Sum_IV {

    public static void main(String[] args) {
        System.out.println(combinationSum4(new int[]{2,1,3}, 35));
    }

    private static int[] memo;

    public static int combinationSum4(int[] nums, int target) {
       memo = new int[target+1];
        Arrays.fill(memo, -1);
       return combinations(nums, target);
    }

    public static int combinations(int[] nums, int target){
        if(target == 0)
            return 1;
        else if(memo[target] != -1)
            return memo[target];

        int total = 0;
        for (int num : nums) {
            if(target >= num)
                total = total + combinations(nums, target - num);
        }

        memo[target] = total;
        return total;
    }


}
