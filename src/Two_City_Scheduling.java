import java.util.*;

public class Two_City_Scheduling {

    public static void main(String[] args) {
        System.out.println(twoCitySchedCost(new int[][]{{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}}));
    }

    public static int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, Comparator.comparingInt(a -> (a[1] - a[0])));
        int cost = 0;
        for(int i = 0; i < costs.length/2; i++)
            cost += costs[i][1] + costs[costs.length-i-1][0];
        return cost;
    }

}
