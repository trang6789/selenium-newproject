package lesson_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearing {

    public static void main(String[] args) {
        // ArrayList implements interface List
        // Raw type - chấp nhận mọi loại dữ liệu

        List<Integer> myList = new ArrayList<>();
        List<Integer> myList2 = Arrays.asList(1,2,3);// ko add/remove thêm dc. Dùng khi  ko muốn thay đổi số lượng phần tử


        myList.add(1);
        myList.add(2);
        myList.add(3);

        for (int index = 0; index < myList.size(); index++) {
//            if(myList.get(index) % 2 !=0){
//                myList.set(index, myList.get(index) + 1);
//            }
            System.out.println(myList.get(index));
        }
        for (Integer number : myList) {
            System.out.println(number);
        }

    }
}
