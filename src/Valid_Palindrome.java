import java.util.Locale;

public class Valid_Palindrome {


    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {


        s = s.toLowerCase();
        char[] characters = s.toCharArray();
        int i = 0;
        int j = characters.length - 1;

        while (i <= j) {


            while (!Character.isLetterOrDigit(characters[i])) {
                ++i;
                if (i > j)
                    return true;
            }
            while (!Character.isLetterOrDigit(characters[j])) {
                --j;
                if (i > j)
                    return true;
            }


            if (characters[i] != characters[j])
                return false;
            ++i;
            --j;
        }

        return true;

    }

}
