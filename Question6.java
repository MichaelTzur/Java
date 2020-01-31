public class Question6 {

    public static boolean isMatrixSymmetricToSecondaryDiagonal(int[][] arr) {

        boolean matrixSymmetric = true;
        int rowIndex1 = 0, columnIndex2 = 0;
        int counter = 0;

        while (rowIndex1 < arr.length - 1 && matrixSymmetric) {
            int columnIndex1 = arr[0].length - 1, rowIndex2 = arr.length - 1;

            while (columnIndex1 > counter && matrixSymmetric) {
                if (arr[rowIndex1][columnIndex1] != arr[rowIndex2][columnIndex2]) {
                    matrixSymmetric = false;
                }
                columnIndex1--;
                rowIndex2--;
            }
            rowIndex1++;
            columnIndex2++;
            counter++;
        }
        return matrixSymmetric;
    }

    public static void main(String[] args) {

        int[][] arr = {{0,1,2,3}, {1,0,4,5}, {2,4,0,6}, {3,5,6,0}};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        if (isMatrixSymmetricToSecondaryDiagonal(arr)) {
            System.out.println("המערך סימטרי");
        }
        else {
            System.out.println("המערך לא סימטרי");
        }
    }
}
