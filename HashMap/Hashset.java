package HashMap;
import java.util.*;
public class Hashset {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set.size());
        if (set.contains(2)) {
            System.out.println("Contains the value 2");
        }
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
