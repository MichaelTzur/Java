package permutation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DataStructureWithoutPermutation {

    private Map<String, Integer> map = new HashMap<>();

    public void addNumToMap(int num) {
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

    public void printMap() {
        System.out.println(map);
        System.out.println("Map size: " + map.size());
    }
}

class Main {

    public static void main(String[] args) {

        DataStructureWithoutPermutation map = new DataStructureWithoutPermutation();
        
        map.addNumToMap(1230);
        map.addNumToMap(1203);
        map.addNumToMap(1023);

        map.printMap();
    }
}
