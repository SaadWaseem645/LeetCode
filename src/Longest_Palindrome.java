import java.util.HashMap;
import java.util.Map;

public class Longest_Palindrome {

    public int longestPalindrome(String s) {

        int max = 0;
        String temp = "";

        for(int i = 0; i < s.length(); ++i) {
            String val = s.substring(i,i+1);
            if (temp.contains(val)) {
                max += 2;
                temp = temp.replace(val, "");
            }else{
                temp += val;
            }
        }

        return max + (temp.isEmpty() ? 0 : 1);

    }

}
