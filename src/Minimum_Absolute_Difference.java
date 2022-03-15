import java.util.*;

public class Minimum_Absolute_Difference {

    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{34,-5,-24,60,2,-46}));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Map<Integer, List<List<Integer>>> map = new HashMap<>();

        Arrays.sort(arr);

        for(int i = 1; i < arr.length; i++){
            int dif = Math.abs(arr[i] - arr[i-1]);

            if(map.containsKey(dif))
                map.get(dif).add(new ArrayList<>(Arrays.asList(arr[i-1], arr[i])));
            else{
                List<List<Integer>> list = new ArrayList<>();
                list.add(new ArrayList<>(Arrays.asList(arr[i-1], arr[i])));
                map.put(dif, list);
            }
        }


        List<Integer> sortedKeys= new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);

        for(Integer key:sortedKeys)
            return map.get(key);

        return null;

    }

}
