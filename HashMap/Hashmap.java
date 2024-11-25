package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        map.put("Russia", 100);
        map.put("India", 130);
        System.out.println(map);
        map.put("China", 200);
        System.out.println(map);
        map.remove("US");
        System.out.println(map);
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
