import java.util.*;

public class Contains_Duplicate {

    public boolean containsDuplicate(int[] nums) {

        for (int i = 1; i < nums.length; ++i)
            if (nums[i - 1] == nums[i]) return true;
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums)
            set.add(num);
        return set.size() != nums.length;
    }

}
