import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reordered_Power_Of_Two {

    public static void main(String[] args) {
        int n = 2;

        System.out.println(reorderedPowerOf2(n));
//        System.out.println( minVal + " power " + );
//        System.out.println(maxVal + " power " + );
    }

    public static boolean reorderedPowerOf2(int n) {

        if(n == 0) return false;

        char[] min = String.valueOf(n).toCharArray(), max = new char[min.length];
        int[] vals = new int[10];
        Arrays.sort(min);
        for(int i = min.length-1, j = 0; i > -1; --i, ++j) {
            max[j] = min[i];
            ++vals[min[i]-'0'];
        }

        if(min[0] == '0')
            for(int i = 0; i < min.length; ++i)
                if(min[i] != '0'){
                    min[0] = min[i];
                    min[i] = '0';
                    break;
                }

        int minVal = Integer.parseInt(String.valueOf(min));
        int maxVal = Integer.parseInt(String.valueOf(max));
        int minPower = findPower(minVal);
        int maxPower = findPower(maxVal);

        for(int i = minPower; i <= maxPower; ++i){
            int pow = (int) Math.pow(2, i);
            int[] tempVals = new int[10];
            char[] tempVal = String.valueOf(pow).toCharArray();
            for (char c : tempVal) {
                ++tempVals[c - '0'];
            }

            boolean flag = true;
            for(int j = 0; j < tempVals.length; ++j){
                if(tempVals[j] != vals[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                return true;
        }

        return false;
    }

    private static int findPower(int n){
        int i = -1;
        while(n != 0){
            ++i;
            n /= 2;
        }

        return i;
    }
}
