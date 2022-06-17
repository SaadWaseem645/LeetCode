import java.util.HashMap;
import java.util.Map;

public class Minimum_Operations_To_Reduce_X_To_Zero {

    public static void main(String[] args) {
        minOperations(new int[]{8828,9581,49,9818,9974,9869,9991,10000,10000,10000,9999,9993,9904,8819,1231,6309}, 134365);
    }

    public static int minOperations(int[] nums, int x){

        Map<Integer, Integer> leftSum = new HashMap<>();
        Map<Integer, Integer> rightSum = new HashMap<>();
        int len = nums.length;
        leftSum.put(0, nums[0]);
        rightSum.put(0, nums[len-1]);

        for(int i = 1; i < len; i++){
            int sum = leftSum.get(i-1)+nums[i];
            leftSum.put(i, sum);
        }

        for(int i = 1; i < len; i++){
            int sum = rightSum.get(i-1)+nums[len-1-i];
            rightSum.put(i, sum);
        }

        System.out.println(leftSum);
        System.out.println(rightSum);

        return 1;

    }


//    private static int minCount = 100001;

//    public static int minOperations(int[] nums, int x) {
//        minCount = 100001;
//        minOperations(nums, x, 0,nums.length-1, 0);
//        System.out.println("COunt is " + (minCount >= 100001? -1 : minCount));
//        return minCount >= 100001? -1 : minCount;
//    }

//    public static void minOperations(int[] nums, int x, int l, int r, int count){
//
//        if(count >= minCount)
//            return;
//        else if(x == 0) {
//            minCount = count;
//            return;
//        }
//        else if(x < 0 || r < l)
//            return ;
//
//        minOperations(nums, x - nums[l], l+1, r, count + 1);
//       minOperations(nums, x - nums[r], l, r-1, count + 1);
//
//    }

//    public static int minOperations(int[] nums, int x, int l, int r, int count){
//
//        if(x == 0)
//            return count;
//        else if(x < 0 || r < l)
//            return -1;
//
//        int left = minOperations(nums, x - nums[l], l+1, r, count + 1);
//        int right = minOperations(nums, x - nums[r], l, r-1, count + 1);
//
//        if(left == -1 && right == -1)
//            return -1;
//        else if(left == -1)
//            return right;
//        else if(right == -1)
//            return left;
//        else return Math.min(left, right);
//    }

}
