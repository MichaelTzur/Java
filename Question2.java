public class Question2 {

    public static boolean isSorted(int[][] arr) {

        boolean isSorted = true;
        int rowIndex = 0;

        while (rowIndex < arr.length && isSorted) {
            int columnIndex = 0;

            while (columnIndex < arr[rowIndex].length - 1 && isSorted) {

                if (arr[rowIndex][columnIndex] > arr[rowIndex][columnIndex + 1]) {
                    isSorted = false;
                }
                columnIndex++;
            }
            if (rowIndex < arr.length -1 && arr[rowIndex][columnIndex] > arr[rowIndex + 1][0]) {
                    isSorted = false;
            }
            rowIndex++;
        }
        return isSorted;
    }

    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4}, {5,6,7,8}};

        System.out.println(isSorted(arr));
    }
}
