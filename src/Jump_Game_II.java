public class Jump_Game_II {

    public static void main(String[] args) {
        System.out.println(jump(new int[]{1,2,3}));
    }

    public static int jump(int[] nums) {

        int steps = 0, max = nums[0], len = nums.length;

        for(int i = 1; i < len; ++i){
            int tempMax = -1, tempIndex = i, tempSum = -1, minSize = Math.min(len, max+i);

            if(max+tempIndex-1 >= len-1)
                return ++steps;

            for(int j = i; j < minSize; ++j){
                int sum = nums[j] + (j-i);

                if(tempSum <= sum){
                    tempIndex = j;
                    tempMax = nums[j];
                    tempSum = sum;
                }
            }
            max = tempMax;
            i = tempIndex;
            ++steps;
        }

        return steps;

    }

}
