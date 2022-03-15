import java.util.Arrays;

public class Rotate_Array {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        if(k == 0)
            return;

        int[] numsTwo = new int[n];
        for(int i = 0; i < n; i++)
            numsTwo[(i+k)%n] = nums[i];

        for(int i = 0; i < n; i++)
            nums[i] = numsTwo[i];

    }
}
