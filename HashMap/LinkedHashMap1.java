package HashMap;

import java.util.*;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        hm.put("USA", 80);
        hm.put("China", 150);
        hm.put("India", 120);

        System.out.println(hm);

        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("USA", 80);
        hm1.put("China", 150);
        hm1.put("India", 120);

        System.out.println(hm1);
    }
}
