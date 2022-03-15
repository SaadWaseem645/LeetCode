public class Binary_Search {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 2));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = (end+start)/2;
        while(true){
            if(nums[mid] == target)
                return mid;
            if(start >= end)
                return -1;

            if(target > nums[mid])
                start = mid+1;
            else end = mid-1;
            mid = (start+end)/2;
        }
    }
}
