import java.util.HashSet;
import java.util.Set;

public class Jump_Game {

//    private static Set<Integer> set;

    public static void main(String[] args) {

        System.out.println(canJump(new int[]{2,3,1,1,4}));
    }

    public static boolean canJump(int[] nums) {

        for(int i = 0, max = 0; i < nums.length; ++i){
            if(i > max) return false;
            max = Math.max(max, i+nums[i]);
        }

        return true;

    }

//    public static boolean canJump(int[] nums) {
//        set = new HashSet<>();
//        return jump(nums,0);
//    }
//
//    private static boolean jump(int[] nums, int index){
//
//        if(index >= nums.length)
//            return true;
//        else if(set.contains(index))
//            return false;
//
//        for(int i = nums[index]; i > 0; --i){
//            if(jump(nums, index+i))
//                return true;
//        }
//        set.add(index);
//
//        return false;
//
//    }

}
