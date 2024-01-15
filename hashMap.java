import java.util.*;

public class hashMap {
    public static void main(String args[]) {
        // Creation
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("Rahul", 1);
        map.put("Manish", 2);
        map.put("Sonali", 3);

        System.out.println(map);

        map.put("Sonali", 4);
        System.out.println(map);

        // Searching
        if (map.containsKey("Rahul")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("Sonali")); // key exists
        System.out.println(map.get("Suresh")); // key doesn't exist

        // Iteration (1)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Iteration (2)
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // Removing
        map.remove("Rahul");
        System.out.println(map);

    }
}
