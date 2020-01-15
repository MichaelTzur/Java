package default1;


import javax.swing.*;

public class Question8 {

    public static void main(String[] args) {

        String strNum1 = JOptionPane.showInputDialog("enter number");
        int num1 = Integer.parseInt(strNum1);

        String strNum2 = JOptionPane.showInputDialog("enter number");
        int num2 = Integer.parseInt(strNum2);

        int counter1 = 0, tmpNum1 = num1, tmpNum2 = num2;

        while (tmpNum1 != 0) {
            if (tmpNum1 % 10 == tmpNum2 % 10) {
                counter1++;
            }
            tmpNum1 = tmpNum1 / 10;
            tmpNum2 = tmpNum2 / 10;
        }
        int[] digit1 = new int[10];

        if (num1 == 0){
            digit1[0]++;
        }
        else {
            while (num1 != 0) {
                int rightDigit1 = num1 % 10;
                digit1[rightDigit1]++;
                num1 = num1 / 10;
            }
        }
        int[] digit2 = new int[10];

        if (num2 == 0) {
            digit2[0]++;
        }
        else {
            while (num2 != 0) {
                int rightDigit2 = num2 % 10;
                digit2[rightDigit2]++;
                num2 = num2 / 10;
            }
        }
        int counter2 = 0;

        for (int i = 0; i < 10; i++) {
            if (digit1[i] > 0 && digit2[i] > 0) {
                counter2++;
            }
        }
        int answer = counter2 - counter1;

        System.out.println(answer);
    }
}
