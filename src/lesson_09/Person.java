package lesson_09;

//encapsulation - tính đóng gói
public class Person {
// Hide object data attribute -> fully control value
// Write only: tạo object -> cho thay đổi giá trị sau khi tạo, nhưng ko cho phép đọc
// Read only
    private String name;
    private int age;

    public Person(String name, int age) throws IllegalAccessException {
        this.name = name;
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalAccessException("Age can't be negative member");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
