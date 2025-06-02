package programmers.day5;

import java.util.HashMap;
import java.util.Map;

public class practice4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, null);
        map.put(5, "d");

        System.out.println(map.getOrDefault(4, "e"));
        System.out.println(map.get(4));

        map.put(4, "e");
        System.out.println(map.get(4));
    }

}
