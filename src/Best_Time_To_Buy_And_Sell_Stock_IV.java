public class Best_Time_To_Buy_And_Sell_Stock_IV {


    public static void main(String[] args) {
        System.out.println(maxProfit(7, new int[]{48,12,60,93,97,42,25,64,17,56,85,93,9,48,52,42,58,85,81,84,69,36,1,54,23,15,72,15,11,94}));
    }
    private static Integer max;
    public static int maxProfit(int k, int[] prices) {
        max = 0;
        int len = prices.length-1;
        if(k == 0) return 0;
        for(int i = 0; i <= len; ++i){
            trade(i, (k*2)-1, len, 0, prices, true);
        }

        return max;
    }

    private static void trade(int currInd, int k, int len, int profit, int[] prices, boolean sell){

        max = Math.max(profit, max);
        if(k == 0 || currInd > len) return;


        for(int i = currInd+1; i <= len; ++i){
            int newProfit = (prices[i] - prices[currInd]);
            if(sell && newProfit < 0)
                continue;
            trade(i, k-1, len, profit + (sell ? newProfit : 0), prices, !sell);
        }


    }

}
