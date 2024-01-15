import java.util.*;

public class hashMap {
    public static void main(String... args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion in map
        map.put("Rahul", 1);
        map.put("Manish", 7);
        map.put("Manish", 17);
        map.put("Sohan", 90);
        map.put("Vikash", 27);
        map.put("Anish", 11);
        map.put("Shreya", 31);

        // Seraching in Map
        if (map.containsKey("Rakesh")) {
            System.out.println("Rakesh is Present in our Map");
        } else {
            System.out.println("It's not present");
        }

        // Traversal of Map
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getValue() + " " + e.getKey());
        }

        // Acces Value with the help of key
        System.out.println(map.get("Vikash"));

        // Deletaion in Map
        map.remove("Vikash");
        System.out.println(map);

    }
}
