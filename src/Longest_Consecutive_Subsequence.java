import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Subsequence {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer num: nums) set.add(num);

        int max = 0;
        for(Integer num: set){
            if(!set.contains(num-1)){
                int temp = num + 1;
                while(set.contains(temp))
                    ++temp;
                max = Math.max(max, temp-num);
            }
        }

        return max;
    }

}
