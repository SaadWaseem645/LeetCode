import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {

    public boolean isAnagram(String s, String t) {

        int lenS = s.length(), lenT = t.length();
        if (lenS != lenT)
            return false;

        int[] c = new int[26];

        for (int i = 0; i < lenS; ++i) {
            int code = s.charAt(i) - 'a';
            c[code] += 1;
            code = t.charAt(i) - 'a';
            c[code] -= 1;
        }

        for (int j : c)
            if (j != 0)
                return false;

        return true;
    }

}
