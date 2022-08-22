import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Substring_with_concatenation_of_all_words {

    public static void main(String[] args) {
        System.out.println(findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake",
                new String[]{"fooo","barr","wing","ding","wing"}));
    }

    public static List<Integer> findSubstring(String s, String[] words) {

        int arrLen = words.length;
        int wordLen = words[0].length();
        int winLen = arrLen*wordLen;
        int offLen = s.length() - winLen;
        int len = s.length();
        int lastWord = winLen-wordLen;


        if(offLen < 0)
            return new ArrayList<>();

        HashMap<String,Integer> baseMap = new HashMap<>();
        HashMap<String,Integer> winMap = new HashMap<>();
        List<Integer> vals = new ArrayList<>();

        for(String word: words) {
            baseMap.merge(word, 1, Integer::sum);
            winMap.merge(word, 0, Integer::sum);
        }

        for(int i = 0; i < len; i = i + wordLen){
            if(i >= winLen) {
                if(checkMap(baseMap, winMap))
                    vals.add(i-winLen);
                winMap.merge(s.substring(i - winLen, i - lastWord), -1, Integer::sum);
            }
            winMap.merge(s.substring(i, i+wordLen), 1, Integer::sum);
        }

        if(checkMap(baseMap, winMap))
            vals.add(len-winLen);

        return vals;

    }

    private static boolean checkMap(HashMap<String, Integer> baseMap, HashMap<String, Integer> winMap){
        for(String key: baseMap.keySet()){
            if(!baseMap.get(key).equals(winMap.get(key)))
                return false;
        }

        return true;
    }


}
