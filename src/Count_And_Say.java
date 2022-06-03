public class Count_And_Say {

    public static String countAndSay(int n) {
        if(n == 1) return "1";

        String res = countAndSay(n-1);
        String temp = "";
        int count = 0;
        for(int i = 0; i <= res.length(); i++){

            if(i == 0)
                count++;
            else if(i == res.length() || (res.charAt(i) != res.charAt(i-1))){
                temp = temp.concat(count+""+(res.charAt(i-1)));
                count = 1;
            }else count++;
        }
        return temp;
    }


}
