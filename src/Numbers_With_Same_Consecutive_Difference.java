import java.util.ArrayList;
import java.util.List;

public class Numbers_With_Same_Consecutive_Difference {

    public static void main(String[] args) {
        numsSameConsecDiff(3,7);
    }

    public static int[] numsSameConsecDiff(int n, int k) {

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i < 10; ++i)
            for(int j = 0; j < 10; ++j)
                if(Math.abs(i-j) == k) {
                    String temp = String.valueOf((i * 10) + j);
                    String newTemp = temp;
                    while(newTemp.length() < n)
                        newTemp = newTemp.concat(temp);
                    if(n%2 == 1)
                        newTemp = newTemp.substring(0, newTemp.length()-1);
                    list.add(Integer.valueOf(newTemp));
                }

        int[] arr  = new int[list.size()];
        for(int i = 0; i < list.size(); ++i){
            arr[i] = list.get(i);
        }

        return arr;
    }
}
