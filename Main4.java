import java.util.HashMap;
import java.util.Map;

public class Main4 {

    public static void main(String[] args) {

        int[] array = {20,20,20,20,40,20,20};

        System.out.println(extractSingleNum(array));
    }

    private static Integer extractSingleNum(int[] array) {

        Map<Integer, Boolean> hashmap = new HashMap<>();

        for (int num : array) {
            hashmap.put(num, hashmap.containsKey(num));
        }
        for (Integer key : hashmap.keySet()) {
            if (!hashmap.get(key)) {
                return key;
            }
        }
        return null;
    }
}
