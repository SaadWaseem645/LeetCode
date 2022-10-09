import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class My_Calendar_III {

    class MyCalendarThree {

        int maxOverlap = 0;


        TreeMap<Integer, Integer> map = new TreeMap<>();

        public MyCalendarThree() {

        }

        public int book(int start, int end) {
            map.merge(start, 1, Integer::sum);
            map.merge(end, -1, Integer::sum);

            Set<Integer> set = map.keySet();
            int count = 0;

            for(Integer key: set)
                if(key > end)
                    break;
                else{
                    count += map.get(key);
                    maxOverlap = Math.max(maxOverlap, count);
                }

            return maxOverlap;
        }
    }

}
