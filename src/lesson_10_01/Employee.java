package lesson_10_01;
// Trườu tượng
// Abstract method ko dc nằm trong non-abstract class
// Abstract class có thể có non-abstract method
// Abstraction: Fully force IS-A relationship (lớp con phải override all method lớp cha)
// Hide detail implementation
// Dùng khi Có nhiều loại object khác nhau, Nhưng chung cấu trúc / hành vi
public abstract class Employee {

    public abstract int getSalary();
    public abstract int getSupportMoney();


}
