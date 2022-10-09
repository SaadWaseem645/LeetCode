public class Sum_Of_Even_Numbers_After_Queries {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {

        int sum = 0, i = 0;
        int[] res = new int[queries.length];

        for(int num: nums) if((num & 1) ==0 ) sum += num;

        for(int[] query: queries){
            int val = query[0], ind = query[1];
            if((nums[ind] & 1) == 0) sum -= nums[ind];

            nums[ind] += val;

            if((nums[ind] & 1) == 0)sum += nums[ind];


            res[i] = sum;
            i += 1;
        }

        return res;

    }
}
