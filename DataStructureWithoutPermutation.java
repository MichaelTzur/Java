package permutation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DataStructureWithoutPermutation {

    private static Map<String, Integer> map = new HashMap<>();

   private static void addNumToMap(int num) {
        //create char array that contains the num digits separated
        char[] numDigits = String.valueOf(num).toCharArray();
        //sort digits in the array
        Arrays.sort(numDigits);
        //convert the char array to String
        String strNum = String.valueOf(numDigits);
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
