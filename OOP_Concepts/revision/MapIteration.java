package OOP_Concepts.revision;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(32, "B");
        map.put(3232, "C");
        map.put(412, "D");
        map.put(2325, "E");
        System.out.println(map);

        // 1 way to iterate on maps

        Set<Integer> keys = map.keySet(); // converting keys in map to set to iterate on them
        System.out.println(keys);
        System.out.println("++++++++++++++++++");
        Collection<String> values = map.values(); // converting values to collection to iterate on them
        System.out.println(values);

        // 2 way to iterate on maps

        Set<Map.Entry<Integer , String>> entry = map.entrySet(); // return set with key,value pair Object.
        System.out.println(entry);

    }
}
