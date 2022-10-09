import java.util.Arrays;

public class Number_Of_Dice_Rolls_With_Target_Sum {

    public static void main(String[] args) {
        System.out.println(numRollsToTarget(30,30,500));
    }

    static int i = 0;
    public static int numRollsToTarget(int n, int k, int target) {

        int max = n * k;
        long[][] memo = new long[n+1][target+1];

        Arrays.stream(memo).forEach(a -> Arrays.fill(a, -1));

        if(target < n || target > max) return 0;

        return (int) count(n, k, target, memo);
    }

    public static long count(int n, int k, int target, long[][] memo){

        System.out.println(i++);

        if(n == 0)
            if(target == 0) return 1;
            else return 0;

        if(memo[n][target] > -1) return memo[n][target];

        long sum = 0;

        for(int i = 1; i <= k; ++i){
            int newTarget = target-i;
            if(newTarget > -1)
                sum = (sum + count(n - 1, k, newTarget, memo))%1000000007;
        }

        memo[n][target] = sum;

        return sum;
    }
}
