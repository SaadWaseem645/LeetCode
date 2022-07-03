public class Find_Pivot_Index {

    public static void main(String[] args) {
        pivotIndex(new int[]{1,2,3,4,5});
    }

    public static  int pivotIndex(int[] nums) {
        int pivot = -1;
        for(int i = 0; i < nums.length - 1 ; ++i) nums[i+1] = nums[i+1] + nums[i];
        int last = 0;
        for(int i = 0; i < nums.length; ++i) {
            if(nums[nums.length-1]-nums[i] == last){
                pivot = i;
                break;
            }else last = nums[i];
        }

        return pivot;
    }

}
