package OOP_Concepts.revision;

import java.util.*;

public class MapIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(32, "B");
        map.put(3232, "C");
        map.put(412, "D");
        map.put(2325, "E");
        System.out.println(map);

        // 1 way to iterate on maps

        Set<Integer> keys = map.keySet(); // converting keys in map to set to iterate on them
         map.forEach((key, value) -> System.out.println(key + ": " + value));
         Iterator<Integer> itr = keys.iterator();
         while(itr.hasNext()){
             int key = itr.next();
             System.out.println(key);
         }
        System.out.println(keys);
        System.out.println("++++++++++++++++++");
        Collection<String> values = map.values(); // converting values to collection to iterate on them
        System.out.println(values);

        // 2 way to iterate on maps

        Set<Map.Entry<Integer , String>> entry = map.entrySet(); // return set with key,value pair Object.
        for(Map.Entry<Integer,String> pair : entry){
            System.out.println(pair.getKey());
        }
        System.out.println(entry);

    }
}
