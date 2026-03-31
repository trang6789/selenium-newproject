package lesson_03;

public class ArrayLearning {

    public static void main(String[] args) {
        int arrayLength = 5;
        int[] myIntArray = new int[arrayLength];

        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        myIntArray[3] = 4;
        myIntArray[arrayLength-1] = 5;

        for (int index = 0; index < myIntArray.length; index++) {
            System.out.printf("Element at the index %d has value %d\n", index, myIntArray[index]);
        }

        for (int index = 0; index < arrayLength; index++) {
            myIntArray[index] = index +1;
        }
        System.out.println("============");
        //enhanced for -lấy dữ liệu nhưng ko thay đổi
        for (int elementValue : myIntArray) {
            System.out.println(elementValue);
        }

    }
}
