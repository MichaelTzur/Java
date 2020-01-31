import javax.swing.*;
import java.util.Random;

public class Question1 {

    public static void main(String[] args) {

        int[][] arr = new int[2][2];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {
                Random rnd = new Random();
                arr[i][j] = rnd.nextInt(100);
            }
        }
        System.out.println(arr[0][0] + " " + arr[0][1]);
        System.out.println(arr[1][0] + " " + arr[1][1]);
    }
}
