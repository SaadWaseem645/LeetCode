import java.lang.reflect.Array;
import java.util.Arrays;

public class Remove_Element {

    public static int removeElement(int[] nums, int val) {
       int l = 0, r = nums.length-1, temp;
       if(r == -1)
           return 0;
       while(l < r){
           if(nums[r] == val) r--;
           else if(nums[l] == val) {
               temp  = nums[r];
               nums[r--] = nums[l];
               nums[l++] = temp;
           }
           else l++;
       }

       return nums[l] == val ? l : l+1;
    }

}
