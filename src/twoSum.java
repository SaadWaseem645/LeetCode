import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum_(new int[]{3, 2, 4}, 6)));
    }

    public static int[] twoSum_(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; ++i){
            if(map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]), i};
            map.put(nums[i], i);
        }
        return new int[]{0,0};
    }

}
