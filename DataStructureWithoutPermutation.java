package permutation;

import java.util.*;

public class DataStructureWithoutPermutation {

    private static Map<String, Integer> map = new HashMap<>();

    private static void addNumToMap(int num) {
        //separate digits to String array
        String[] numDigits = String.valueOf(num).split("");
        //sort digits
        Arrays.sort(numDigits);
        //combine digits from the array to one String
        String strNum = String.join("", numDigits);
        //check for permutation
        if (!map.containsKey(strNum)) {
            map.put(strNum, num);
        }
    }

//    public static void main(String[] args) {
//
//        addNumToMap(1230);
//        addNumToMap(1203);
//        addNumToMap(1023);
//
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
//        }
//        System.out.println("Map size: " + map.size());
//    }
}
