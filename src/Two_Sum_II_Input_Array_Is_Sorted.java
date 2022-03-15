import java.util.Arrays;

public class Two_Sum_II_Input_Array_Is_Sorted {
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length-1;
        while(true){
            int sum = numbers[start] + numbers[end];
            if(sum == target)
                return new int[]{start+1, end+1};
            if (sum > target) end--;
            else start++;
        }
    }
}
