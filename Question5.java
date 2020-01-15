package default1;

public class Question5 {

    public static void main(String[] args) {

        int[] array = {20,20,30,70};

        boolean balance = false;
        int dividePoint = 0;

        while (dividePoint < array.length - 1 && !balance) {

            int sum1 = 0;
            for (int i = 0; i <= dividePoint; i++) {
                sum1 = sum1 + array[i];
            }
            int sum2 = 0;
            for (int j = dividePoint + 1; j <= array.length -1; j++) {
                sum2 = sum2 + array[j];
            }
            if (sum1 == sum2) {
                balance = true;
            }
            dividePoint++;
        }
        if (balance) {
            System.out.println("the array is balanced");
        }
        else {
            System.out.println("the array is not balanced");
        }
    }
}
