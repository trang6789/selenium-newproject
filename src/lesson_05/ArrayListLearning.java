package lesson_05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {
        List<Integer> myArraylist = new ArrayList<>();
        myArraylist.add(1);
        myArraylist.add(2);
        myArraylist.add(3);
        myArraylist.add(4);
        myArraylist.add(4);// cho tạo arraylist trùng value

        for (int index = 0; index < myArraylist.size(); index++) {
            int currentNumber = myArraylist.get(index);

            if (currentNumber % 2 != 0) {
                myArraylist.set(index, currentNumber + 1);
            }
        }
        System.out.println(myArraylist);

//        int arraySize = myArraylist.size();
//        for (int index = 0; index < arraySize; index++) {
//            int currentNumber = myArraylist.get(index);
//
//            if (currentNumber == 4) {
//                myArraylist.remove(new Integer(4));
//                arraySize--;
//                index--;
//            }
//            System.out.println(myArraylist);
//        }
        myArraylist.removeIf(num -> num == 4 );
        System.out.println(myArraylist);

        //dot notation
        System.out.println(myArraylist.isEmpty());
        System.out.println(myArraylist.contains(1));

        System.out.println(myArraylist.indexOf(2)); //trả về index đầu tiên gặp

    }
}
