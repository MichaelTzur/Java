import javax.swing.*;

public class Question1 {

    public static void main(String[] args) {

        int[][] arr = new int[2][2];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {
                String strNum = JOptionPane.showInputDialog("enter number");
                int num = Integer.parseInt(strNum);

                arr[i][j] = num;
            }
        }
        System.out.println(arr[0][0] + " " + arr[0][1]);
        System.out.println(arr[1][0] + " " + arr[1][1]);
    }
}
