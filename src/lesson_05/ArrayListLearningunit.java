package lesson_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListLearningunit {

    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(4);
        myArrayList.add(1);
        myArrayList.add(3);
        myArrayList.add(2);
        myArrayList.add(4);

        List<Integer> withoutDuplicatedValue = new ArrayList<>();
        //primitive type
        for (Integer value : myArrayList) {
            if(!withoutDuplicatedValue.contains(value)){
                withoutDuplicatedValue.add(value);
            }
        }
        System.out.println(myArrayList);
        System.out.println(withoutDuplicatedValue);

        // sort và ko cho giá trị trùng lặp dc khởi tạo.(Ít dùng)
        Set<Integer> set = new HashSet<>(myArrayList);
        List<Integer> arrayListWithSet = new ArrayList<>(set);
        System.out.println(arrayListWithSet);

        //3: Exclusive
        List<Integer> first3MinValues  = arrayListWithSet.subList(0,3);
        System.out.println(first3MinValues);

    }
}
