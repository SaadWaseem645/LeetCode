import java.util.ArrayList;
import java.util.List;

public class Permutation_Sequence {

    public static String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
            list.add(i+1);


        return permutation(n, k-1, (k-1)%2==0, list);
    }

    public static String permutation(int n, int k, boolean even, List<Integer> list){

        if(n == 1) return String.valueOf(n);
        else if(n == 2){
            if(even) return list.get(0) + "" + list.get(1);
            else return list.get(1) + "" + list.get(0);
        }

        int fact = 1;
        for(int i = 1; i < n; i++)
            fact *= i;

        int div = k/fact;
        int val = list.get(div);
        list.remove(div);

        return val + permutation(n-1, k%fact, even, list);
    }

}
