import java.util.PriorityQueue;

public class Gas_Station {

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{5,8,2,8}, new int[]{6,5,6,6}));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int total = 0, curr = 0, start = 0;
        for(int i = 0; i < gas.length; ++i){
            int sum = gas[i] - cost[i];
            curr += sum;
            total += sum;
            if(curr < 0){
                curr = 0;
                start = i+1;
            }
        }
        return total < 0 ? -1: start;
    }
}
