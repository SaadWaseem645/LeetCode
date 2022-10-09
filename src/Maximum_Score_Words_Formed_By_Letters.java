import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maximum_Score_Words_Formed_By_Letters {

    public static void main(String[] args) {

        String[] words = new String[]{"da", "ac", "aba", "abcc", "cadc"};
        char[] letters = new char[]{'a', 'a', 'a', 'a', 'b', 'c', 'c', 'c', 'd', 'd', 'd'};
        int[] score = new int[]{3, 7, 9, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println(maxScoreWords(words, letters, score));
    }

    public static int maxScoreWords(String[] words, char[] letters, int[] score) {
        int wordLen = words.length;
        int[] letterMap = new int[26];
        int max = 0;

        for (char letter : letters)
            letterMap[letter - 'a'] += 1;

        for (int i = 0; i < wordLen; ++i)
            max = Math.max(max, formWord(words, score, letterMap, i, wordLen));

        return max;

    }

    public static int formWord(String[] words, int[] score, int[] letterMap, int index, int wordLen) {

        String word = words[index];
        int len = word.length();
        boolean wordAccepted = true;

        for (int i = 0; i < len; ++i) {
            int wordInd = word.charAt(i) - 'a';
            if (letterMap[wordInd] == 0)
                wordAccepted = false;
            --letterMap[wordInd];
        }

        int tempSum = 0;

        if (wordAccepted)
            for (int i = index + 1; i < wordLen; ++i)
                tempSum = Math.max(formWord(words, score, letterMap, i, wordLen), tempSum);

        for (int i = 0; i < len; ++i) ++letterMap[word.charAt(i) - 'a'];

        if(!wordAccepted) return 0;

        int sum = 0;
        for(int i = 0; i < len; ++i) sum += score[word.charAt(i)-'a'];

        return sum + tempSum;

    }

}
