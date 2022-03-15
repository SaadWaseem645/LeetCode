import java.util.ArrayList;
import java.util.List;

public class Longest_Palindromic_Substring {


    public static void main(String[] args) {
        System.out.println(sol("babbaba"));
    }


    public static String sol(String s){
        String palin = "";
        String reversed = new StringBuilder(s).reverse().toString();
        int len = s.length();
        int palinLen = palin.length();

        for(int i = 0; i < len; i++){
            if(i+palinLen > len)
                break;
            for(int j = 0; j < len; j++){
                String temp = s.substring(i, len-j);
                if(temp.equals(reversed.substring(j,len-i))){
                    if(temp.length() > palinLen){
                        palin = temp;
                        palinLen = palin.length();
                    }
                    break;
                }
            }
        }

        return palin;
    }

}
