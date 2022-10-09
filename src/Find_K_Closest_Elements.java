import java.util.ArrayList;
import java.util.List;

public class Find_K_Closest_Elements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int start = 0, end = k, len = arr.length;

        while(end < len){

            if((Math.abs(arr[end] - x) < Math.abs(arr[start] - x)) || arr[start] == arr[end]){
                ++start; ++end;
            }else break;

        }

        List<Integer> list = new ArrayList<>();
        for(int i = start; i < end; ++i)
            list.add(arr[i]);

        return list;

    }
}
