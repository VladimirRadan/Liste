import java.util.HashMap;
import java.util.Map;

public class Mape {


    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Text 1");
        map.put(2, "Text 2");
        map.put(3, "Text 3");
        map.put(4, "Text 4");
        map.put(5, "Text 5");
        map.put(1, "Text 6");

        for (Map.Entry m:map.entrySet()) {
            System.out.println("Key: " + m.getKey() + " Value: " + m.getValue());
        }

        Map<Boolean, Character> map1 = new HashMap<>();
        map1.put(true, 'A');







    }





}
