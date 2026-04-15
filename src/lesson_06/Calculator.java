package lesson_06;

public class Calculator {
    //Method signature --name, parameters (số lượng, loại)
    public int sum(int a, int b) {
        return a + b;
    }
    //Method overloading - trùng tên, khác parameter : compile time
    //Method overriding: Run Time
    // Method overloading - Dùng chung logic,khác dữ liệu đầu vào

    public int sum(int a, int b, int c) {
        return a + b;
    }

    //    public int sum3(int a, int b, int c){
//        return a+b+c;
//    }
    //Varagrs | Rest Parameter
    public int sum(int... numbers) {
        int arrayTotal = 0;
        for (int number : numbers) {
            arrayTotal = arrayTotal + number;
        }
        return arrayTotal;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(1, 2, 3));
        System.out.println(calculator.sum(1, 2, 3, 4, 5));
    }
}
