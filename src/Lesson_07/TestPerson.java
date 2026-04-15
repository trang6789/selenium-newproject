package Lesson_07;

import java.util.ArrayList;
import java.util.List;

// Functional Programming: reuse về logic
//OOP > Inheritance > break: reuse về design

public class TestPerson {

    public static void main(String[] args) {
        Person teo = new Person("Teo", 18);
        Person teo2 = new Person("Teo", 18);

        List<Person> personList = new ArrayList<>();
        personList.add(teo);
        personList.add(teo);

        System.out.println(personList);

        personList.get(0).setName("Tun");

        System.out.println(personList);

    }
}
