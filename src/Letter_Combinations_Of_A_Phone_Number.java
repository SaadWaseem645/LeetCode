import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_Of_A_Phone_Number {

    public List<String> letterCombinations(String digits) {

        if(digits.isEmpty())
            return new ArrayList<String>();

        char[] arr = digits.toCharArray();
        List<String> res = new ArrayList<String>();
        combinations(arr, "", 0, arr.length, res);
        return res;

    }

    private void combinations(char[] arr, String str, int n, int len, List<String> res){
        if(n == len){
            res.add(str);
            return;
        }

        switch(arr[n]){
            case '2':
                combinations(arr, str+"a", n+1, len, res);
                combinations(arr, str+"b", n+1, len, res);
                combinations(arr, str+"c", n+1, len, res);
                break;
            case '3':
                combinations(arr, str+"d", n+1, len, res);
                combinations(arr, str+"e", n+1, len, res);
                combinations(arr, str+"f", n+1, len, res);
                break;
            case '4':
                combinations(arr, str+"g", n+1, len, res);
                combinations(arr, str+"h", n+1, len, res);
                combinations(arr, str+"i", n+1, len, res);
                break;
            case '5':
                combinations(arr, str+"j", n+1, len, res);
                combinations(arr, str+"k", n+1, len, res);
                combinations(arr, str+"l", n+1, len, res);
                break;
            case '6':
                combinations(arr, str+"m", n+1, len, res);
                combinations(arr, str+"n", n+1, len, res);
                combinations(arr, str+"o", n+1, len, res);
                break;
            case '7':
                combinations(arr, str+"p", n+1, len, res);
                combinations(arr, str+"q", n+1, len, res);
                combinations(arr, str+"r", n+1, len, res);
                combinations(arr, str+"s", n+1, len, res);
                break;
            case '8':
                combinations(arr, str+"t", n+1, len, res);
                combinations(arr, str+"u", n+1, len, res);
                combinations(arr, str+"v", n+1, len, res);
                break;
            case '9':
                combinations(arr, str+"w", n+1, len, res);
                combinations(arr, str+"x", n+1, len, res);
                combinations(arr, str+"y", n+1, len, res);
                combinations(arr, str+"z", n+1, len, res);
                break;
        }
    }

}
