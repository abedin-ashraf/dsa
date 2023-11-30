package HashMap;

import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(8);
        hs.add(9);
        hs.add(3);
        hs.add(5);
        hs.add(4);
        System.out.println(hs);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        hs.add(2);
    }
}
