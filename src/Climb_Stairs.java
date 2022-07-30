import java.util.HashMap;
import java.util.Map;

public class Climb_Stairs {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        if(n == 0)
            return 1;
        else if(n < 0)
            return 0;

        if(memo.containsKey(n))
            return memo.get(n);

        int sum = climbStairs(n-1) + climbStairs(n-2);
        memo.put(n, sum);
        return sum;
    }

}
