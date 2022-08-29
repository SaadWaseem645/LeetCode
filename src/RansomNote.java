import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] note = new int[26], mag = new int[26];
        char[] noteArr = ransomNote.toCharArray(), magArr = magazine.toCharArray();

        for(char c: noteArr)
            note[c-'a'] += 1;

        for(char c: magArr)
            mag[c-'a'] += 1;

        for(int i = 0; i < 26; ++i)
            if(note[i] > mag[i]) return false;

        return true;
    }
}
