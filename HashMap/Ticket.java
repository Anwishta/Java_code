package HashMap;
import java.util.*;
public class Ticket {
    public static String getStart(HashMap<String, String> ticks){
        HashMap<String, String> revticks = new HashMap<>();
        for(String key : ticks.keySet()){
            revticks.put(ticks.get(key), key);
    }
    for(String key : ticks.keySet()){
        if (!revticks.containsKey(key)) {
            return key;
        }
    }
    return null;
}
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start = getStart(map);
        while (map.containsKey(start)) {
            System.out.print(start+"->");
            start = map.get(start);
        }
        System.out.print(start);
    }
}
