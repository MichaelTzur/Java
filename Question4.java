public class Question4 {

    public static boolean isColumnSumEqualsNum(int[][] arr, int num) {

        boolean columnSumEqualsNum = false;
        int columnIndex = 0;

        while (columnIndex < arr[0].length && !columnSumEqualsNum) {
            int sum = 0;

            for (int rowIndex = 0; rowIndex < arr.length; rowIndex++) {
                sum = sum + arr[rowIndex][columnIndex];
            }
            if (sum == num) {
                columnSumEqualsNum = true;
            }
            columnIndex++;
        }
        return columnSumEqualsNum;
    }

    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4}, {5,6,7,8}};
        int num = 8;

        System.out.println(isColumnSumEqualsNum(arr, num));
    }
}
