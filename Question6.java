package default1;

import javax.swing.*;

public class Question6 {

    public static void main(String[] args) {

        String strNum = JOptionPane.showInputDialog("enter number");
        int num = Integer.parseInt(strNum);

        int[] array = new int[10];

        while (num != 0) {
            int rightDigit = num % 10;
            array[rightDigit]++;
            num = num / 10;
        }
        boolean repeatDigit = false;
        int i = 0;

        while (i < 10 && !repeatDigit) {
            if (array[i] > 1) {
                repeatDigit = true;
            }
            i++;
        }
        if (repeatDigit) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
