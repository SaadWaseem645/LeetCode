public class Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s) {

        String longest = "";
        String current = "";

        for(int i = 0; i < s.length(); i++){
            String charString = String.valueOf(s.charAt(i));
            if(current.contains(charString)) {
                if (current.length() > longest.length())
                    longest = current;
                int lastIndex = current.lastIndexOf(charString);
                current = current.substring(lastIndex+1);
            }

            current += charString;
        }

        return Math.max(longest.length(), current.length());

    }

}
