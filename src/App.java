import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main (String ...args) {
        int[] intArray = {1, 2, 3, 4, 5, 5, 6, 6, 7, 4, 6, 4, 3, 3, 5, 8};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < intArray.length; i++) {
            int key = intArray[i];
            if (map.containsKey(key)) {
                int count = map.get(key);
                count++;
                map.put(key, count);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(" Number  |  time(s)  |");
        System.out.println(" (key )  |(occurrence)|");
        System.out.println("-------------------------");
        for (Map.Entry<Integer, Integer> val : map.entrySet()) {
            System.out.println(" |    " + val.getKey() + "  | " + val.getValue() + "         |");
        }
        System.out.println("-------------------------");
    }
}
