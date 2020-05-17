public class Main3 {

    public static void main(String[] args) {

        int[] array = {-10,-8,3,4,5,20,100,200};

        System.out.println(isSumOfTwoNumIsTen(array));
    }

    private static boolean isSumOfTwoNumIsTen(int[] array) {

        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (leftIndex < rightIndex) {
            int sum = array[leftIndex] + array[rightIndex];

            if (sum < 10) {
                leftIndex++;
            }
            else if (sum > 10){
                rightIndex--;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
