import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Time_Base_KeyValue_Store {

    class TimeMap {

        private Map<String, Map<Integer, String>> store;

        public TimeMap() {
            store = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if(!store.containsKey(key))
                store.put(key, new HashMap<>());
            store.get(key).put(timestamp, value);
        }

        public String get(String key, int timestamp) {
            if(store.containsKey(key)){
                Map<Integer, String> map = store.get(key);

                for(int i = timestamp; i >= 0; --i)
                    if(map.containsKey(i)) return map.get(i);

                return "";
            }
            return "";
        }
    }

}
