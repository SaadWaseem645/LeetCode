public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target)
                return mid;
            if(target > nums[mid])
                start = mid + 1;
            else end = mid - 1;
        }

        if(target > nums[start])
            return start + 1;
        else return start;

    }
}
