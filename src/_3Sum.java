import java.util.*;

public class _3Sum {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{0,0,0}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        if(nums.length < 3)
            return new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        Set<List<Integer>> sols = new HashSet<>();

        for(Integer num: nums)
            if(map.containsKey(num))
                map.put(num, map.get(num)+1);
            else
                map.put(num, 1);

        Integer[] keyset = map.keySet().toArray(new Integer[sols.size()]);

        for(int i = 0; i < keyset.length; ++i){
            for(int j = i; j < keyset.length; ++j){
                int target = keyset[i] + keyset[j];
                if(map.containsKey(-target)){
                    if ((i == j && keyset[j] == -target && map.get(keyset[i]) < 3)
                            || ((i == j || keyset[j] == -target) && map.get(keyset[j]) < 2) || ((keyset[i] == -target && map.get(keyset[i]) < 2)))
                        continue;
                    else{
                        List<Integer> sol = new ArrayList<>();
                        sol.add(keyset[i]);
                        sol.add(keyset[j]);
                        sol.add(-target);
                        Collections.sort(sol);
                        sols.add(sol);
                    }

                }

            }
        }

//        for(int i = 0; i < keyset.length; i++) {
//            if(keyset[i] > 0)
//                break;
//            for (int j = i; j < keyset.length; j++) {
//                for (int k = keyset.length - 1; k >= j; k--) {
//
//                    int sum = (keyset[i] + keyset[j]);
//                    if (sum > 0 && keyset[k] > 0)
//                        break;
//                    else if (sum < 0 && keyset[k] < 0)
//                        continue;
//
//                    if ((i == j && j == k && map.get(keyset[i]) < 3) || ((i == j || j == k) && map.get(keyset[j]) < 2))
//                        continue;
//
//                    if ((sum == -keyset[k])) {
//                        List<Integer> sol = new ArrayList<>();
//                        sol.add(keyset[i]);
//                        sol.add(keyset[j]);
//                        sol.add(keyset[k]);
//                        Collections.sort(sol);
//                        sols.add(sol);
//                        break;
//                    }
//
//                }
//            }
//        }

        return new ArrayList<>(sols);

    }

}
