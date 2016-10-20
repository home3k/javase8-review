package me.home3k.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author home3k
 */
public class Maps {

    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("1", 1);
        maps.putIfAbsent("2", 2);
        maps.putIfAbsent("2", 20);
        maps.putIfAbsent("3", 3);

        maps.computeIfPresent("3", (key, value) -> value * 100);

        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            System.out.printf(" key %s -> value %d \n", entry.getKey(), entry.getValue());
        }

    }
}
