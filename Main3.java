public class Main3 {

    public static void main(String[] args) {

        int[] array = {-10,-8,3,4,5,20,100,200};

        System.out.println(isSumOfTwoNumIsTen(array));
    }

    private static boolean isSumOfTwoNumIsTen(int[] array) {

        int first = 0;
        int last = array.length - 1;

        while (first < last) {
            int sum = array[first] + array[last];
            
            if (sum < 10) {
                first++;
            }
            else if (sum > 10){
                last--;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
