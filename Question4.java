package default1;

public class Question4 {

    public static void main(String[] args) {

        int[] array = {1,2,3,3,2,1};

        boolean palindrom = true;
        int counter1 = 0, counter2 = array.length -1;

        while (counter1 < counter2 && palindrom) {

            if (array[counter1] != array[counter2]) {
                palindrom = false;
            }
            counter1++;
            counter2--;
        }
        if (palindrom) {
            System.out.println("המערך הוא פלינדרום");
        }
        else {
            System.out.println("המערך אינו פלינדרום");
        }
    }
}

