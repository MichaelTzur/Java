import java.util.LinkedHashMap;
import java.util.Map;

public class E extends Child {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new LinkedHashMap<>();


        map.put(2,2);
        map.put(2,2);
        map.put(2,2);


        for ( Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }


}
