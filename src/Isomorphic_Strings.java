import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Isomorphic_Strings {

    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                if (!map.get(s.charAt(i)).equals(t.charAt(i)))
                    return false;
            } else if (map.containsValue(t.charAt(i)))
                return false;
            else
                map.put(s.charAt(i), t.charAt(i));
        }

        return true;
    }


}
