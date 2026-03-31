package lesson_04;

public class ArrayPostfixPrefix {

    public static void main(String[] args) {
        int arraylength = 5;
        int[] myIntArr = new int[arraylength];

        for (int index = 0; index < arraylength; index++) {
            myIntArr[index] = index + 1 ;
        }
//        for (int index = 0; index < arraylength;) {
//            myIntArr[index++] = index ;
//        }

        for (int value : myIntArr) {
            System.out.println(value);

        }
    }
}
