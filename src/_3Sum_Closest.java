import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _3Sum_Closest {

    public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);

        int len = nums.length-2;
        int fullLen = len+1;
        int sum = Integer.MAX_VALUE;


        for(int i= 0, j = 1, k = fullLen; i < len; ++i, j = i+1, k = fullLen){
            int absSum = Math.abs(sum - target);
            while(j < k){
                int newSum = nums[i] + nums[j] + nums[k];
                if(Math.abs(newSum - target) < absSum){
                    sum = newSum;
                    absSum = Math.abs(sum - target);
                }
                if(target > newSum) ++j;
                else if(target < newSum) --k;
                else return newSum;
            }
        }

        return sum;
    }

//    public static int threeSumClosest(int[] nums, int target) {
//
//        Map<Integer, Integer> nMap = new HashMap<>();
//        for (int num : nums)
//            nMap.merge(num, 1, Integer::sum);
//
//        Integer[] set = nMap.keySet().toArray(new Integer[]{});
//        int len = set.length;
//        int currentClosest = Integer.MAX_VALUE;
//        int currentValue = 0;
//
//        for (int i = 0; i < len; ++i)
//            for (int j = i; j < len; ++j) {
//                for (int k = j; k < len; ++k) {
//
//                    boolean checkI = i == j;
//                    boolean checkJ = j == k;
//
//                    if ((checkI && nMap.get(set[i]) < 2) ||
//                            ((checkI || checkJ) && nMap.get(set[j]) < 2) ||
//                            (k == j && nMap.get(set[k]) < 2) || (checkI && checkJ && nMap.get(set[i]) < 3))
//                        continue;
//                    else {
//                        int val = set[i] + set[j] + set[k];
//                        int diff = Math.abs(val - target);
//                        if (currentClosest > diff) {
//                            currentValue = val;
//                            currentClosest = diff;
//                            if (currentClosest == 0) return currentValue;
//                        }
//                    }
//
//                }
//            }
//        return currentValue;
//    }

}
