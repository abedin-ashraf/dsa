package HashMap;

import java.util.*;

public class One {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("tea", 10);
        hm.put("pizza", 30);
        hm.put("coffee", 70);
        hm.put("burger", 80);
        System.out.println(hm);
        hm.put("coffee", 100);
        System.out.println(hm);

        System.out.println(hm.get("tea"));

        System.out.println(hm.remove("pizza"));
        System.out.println(hm);
        System.out.println(hm.containsKey("pizza"));
        System.out.println(hm.size());

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("keys = " + k + " value = " + hm.get(k));
        }
    }
}
