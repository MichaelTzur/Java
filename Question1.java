package default1;

import javax.swing.*;
import java.util.Random;

public class Question1 {

    public static void main(String[] args) {

        Random rnd = new Random();
        int num = rnd.nextInt(21);

        for (int i = 0; i < 5; i++) {
            String strNum = JOptionPane.showInputDialog("enter number");
            int num2 = Integer.parseInt(strNum);

            if (num2 > num) {
                System.out.println("too high");
            } else if (num2 < num) {
                System.out.println("too low");
            } else {
                System.out.println("congratulations! " + num2 + " is the number.");
                break;
            }
            if (i == 4) {
                System.out.println("the number is " + num);
            }
        }
    }
}
