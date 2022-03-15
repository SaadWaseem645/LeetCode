public class Is_Subsequence {

    public boolean isSubsequence(String s, String t) {
        for(int i = 0; i < t.length() && s.length() != 0; i++)
            if(s.charAt(0) == t.charAt(i)) s = s.substring(1);
        return s.length() == 0;
    }

}
