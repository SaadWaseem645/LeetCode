import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascals_Triangle {

    public List<List<Integer>> generate(int numRows) {

        Integer[] tempArr = new Integer[]{1};
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 2; i <= numRows; ++i) {
            Integer[] arr = new Integer[i];
            for (int j = 0; j < i; ++j) {
                if (j == 0 || j == i - 1)
                    arr[j] = 1;
                else arr[j] = tempArr[j-1] + tempArr[j];
            }
            list.add(Arrays.asList(tempArr));
            tempArr = arr;
        }

        list.add(Arrays.asList(tempArr));
        return list;
    }

}
