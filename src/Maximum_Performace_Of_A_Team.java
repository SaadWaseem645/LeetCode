import java.util.Arrays;
import java.util.Comparator;

public class Maximum_Performace_Of_A_Team {

    public static void main(String[] args) {
        System.out.println(maxPerformance(6, new int[]{2,10,3,1,5,8}, new int[]{5,4,3,9,7,2}, 4));
    }

    public static int maxPerformance(int n, int[] speed, int[] efficiency, int k) {

        int[] res = new int[k];

        final int[][] newArr = new int[n][2];
        for(int i = 0; i < n; ++i) {
            newArr[i] = new int[] {speed[i], efficiency[i]};
        }
        Arrays.sort(newArr, Comparator.comparingInt(a -> -a[1]));

        for(int i = 0; i < k; ++i) res[i] = i;

        int currentMax = performaceCalc(newArr, res);


        for(int i = k; i < n; ++i){
            int[] best = new int[2];
            for(int j = 0; j < k; ++j){
                int prev = res[j];
                res[j] = i;
                int max = performaceCalc(newArr, res);
                res[j] = prev;
                if(max > currentMax){
                    best[0] = j;
                    best[1] = i;
                }
            }
            if(best[1] > 0){
                res[best[0]] = best[1];
                currentMax = performaceCalc(newArr, res);
            }
        }

        for(int i: res)
            System.out.println(i);
        return currentMax;

    }

    public static int performaceCalc(int[][] speedEff, int[] res){

        int totalSpeed = 0;
        int min = Integer.MAX_VALUE;
        for (int re : res) {
            totalSpeed += speedEff[re][0];
            min = Math.min(min, speedEff[re][1]);
        }

        return totalSpeed * min;

    }

}
