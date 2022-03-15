public class Reverse_String {

    public void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        while(start <= end){
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
    }

}
