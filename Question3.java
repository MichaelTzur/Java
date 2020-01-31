public class Question3 {

    public static boolean isRowSumEqualsNum(int[][] arr, int num) {

        boolean rowSumEqualsNum = false;
        int rowIndex = 0;

        while (rowIndex < arr.length && !rowSumEqualsNum) {
            int sum = 0;

            for (int i = 0; i < arr[rowIndex].length; i++) {
                sum = sum + arr[rowIndex][i];
            }
            if (sum == num) {
                rowSumEqualsNum = true;
            }
            rowIndex++;
        }
        return rowSumEqualsNum;
    }

    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4}, {5,6,7,8}};
        int num = 10;

        System.out.println(isRowSumEqualsNum(arr, num));
    }
}
