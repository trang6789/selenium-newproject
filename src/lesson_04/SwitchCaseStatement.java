package lesson_04;

import java.util.Scanner;
//dùng để so sánh 1 biến với nhiều giá trị cụ thể, khi có nhiều điều kiện so sánh ==
public class SwitchCaseStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int userInput = scanner.nextInt();

//        if(userInput == 1){
//            System.out.println("Giải nhất!");
//        }else if(userInput == 2){
//            System.out.println("Giải nhì!");
//        }else if(userInput == 3){
//            System.out.println("Giải ba!");
//        }else {
//            System.out.println("Chúc bạn may mắn lần sau!");
//        }

        switch (userInput){
            case 1:
                System.out.println("Giải nhất!");
                break;
            case 2:
                System.out.println("Giải nhì!");
                break;
            case 3:
                System.out.println("Giải ba!");
                break;
            default:
                System.out.println("Chúc bạn may mắn lần sau!");
        }

    }
}
