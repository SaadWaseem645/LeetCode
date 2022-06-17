public class Longest_Palindrome_Size {

    public static void main(String[] args) {
        longestPalindrome("abccccdd");
    }

    public static int longestPalindrome(String s) {

        int max = 0;

        for(int i = 0; i < s.length(); i++){

            if(s.length() - i < max)
                break;

            for(int j = s.length()-1; j >= i; j--){
                if(j - i < max)
                    break;
                if(s.charAt(i) != s.charAt(j))
                    continue;

                StringBuilder stringBuilder = new StringBuilder(s.substring(i,j+1));
                if(stringBuilder.toString().equals(stringBuilder.reverse().toString())) {
                    max = Math.max(max,stringBuilder.length());
                    break;
                }

            }
        }

        System.out.println(max);
        return max;

    }
}
