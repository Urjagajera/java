import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Urja");
        map.put(2, "Spark");

        for (Map.Entry<Integer, String> e : map.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
