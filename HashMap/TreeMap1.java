package HashMap;

import java.util.*;

public class TreeMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("USA", 80);
        hm1.put("China", 150);
        hm1.put("India", 120);
        hm1.put("Argentina", 12);
        System.out.println("HashMap: " + hm1);

        LinkedHashMap<String, Integer> hm2 = new LinkedHashMap<>();
        hm2.put("USA", 80);
        hm2.put("China", 150);
        hm2.put("India", 120);
        hm2.put("Argentina", 12);

        System.out.println("LinkedHashMap: " + hm2);

        TreeMap<String, Integer> hm = new TreeMap<>();
        hm.put("USA", 80);
        hm.put("China", 150);
        hm.put("India", 120);
        hm.put("Argentina", 12);

        System.out.println("TreeMap: " + hm);

    }
}
