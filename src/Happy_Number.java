import java.util.HashMap;
import java.util.Map;

public class Happy_Number {

    public static void main(String[] args) {
        isHappy(19);
        System.out.println(map);
    }
    public static Map<Integer, Boolean> map = new HashMap<>();

    public static boolean isHappy(int n) {
        if(n == 1)
            return true;
        else if(map.containsKey(n))
            return map.get(n);
        int tempN = n;
        int num = 0;
        map.put(n, false);
        while(n > 0){
            int temp = n%10;
            num += temp*temp;
            n /= 10;
        }

        boolean res = isHappy(num);
        map.put(num, res);
        map.put(tempN, res);
        return res;
    }
}
