import java.util.Arrays;

public class Reverse_Word_In_A_String {

    public String reverseWords(String s) {
        char[] string = s.toCharArray();
        int n = string.length-1;
        int start = 0, end = 0;
        for(int i = 0; i <= n; i++){
            if(string[i] == ' ' || i == n){
                if(i == n)
                    end++;
                while(start <= end){
                    char temp = string[start];
                    string[start++] = string[end];
                    string[end--] = temp;
                }
                start = i + 1;
                end = i;
            }else end = i;
        }
        return String.valueOf(string);
    }

}
