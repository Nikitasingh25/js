
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("china", 130);
        map.put("us", 80);
        map.put("china", 180);

        map.remove("us");

        if (map.containsKey("India")) {
            System.out.println("present");
        }
        System.out.println(map);
    }
}
