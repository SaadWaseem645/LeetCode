import java.util.Arrays;

public class Decode_Ways {

    public int numDecodings(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int[] memo = new int[len];
        Arrays.fill(memo, -1);

        if(arr[0] == '0') return 0;

        return findCombo(arr, 0, len, memo);

    }


    public int findCombo(char[] arr, int index, int len, int[] memo){

        if(index >= len-1){
            if(index < len && arr[index] == '0') return 0;
            return 1;
        }

        if(memo[index] != -1) return memo[index];

        if(arr[index] == '0') return 0;

        int sum = 0;

        if(arr[index] == '1' || (arr[index] == '2' && arr[index+1] < '7'))
            sum = findCombo(arr, index+2, len, memo);

        sum += findCombo(arr, index+1, len, memo);
        memo[index] = sum;

        return sum;
    }

}
