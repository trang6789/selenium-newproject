package lesson_02;

import java.util.Scanner;
// if - Kiểm tra độc lập → có thể chạy nhiều cái
// else if - Chọn 1 trong nhiều điều kiện, Chỉ chạy 1 block duy nhất
public class IfElseStatement {

    public static void main(String[] args) {
        final int EXPECTED_TIME = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Pls input arrival Time: ");
        int arrivalTime = scanner.nextInt();

        // == != > < >= <= Comparison operator

        boolean isHeOnTime = (arrivalTime == EXPECTED_TIME);
        // isHeOnTime is a expression that can return a boolean value
//        if(isHeOnTime){
//            System.out.println("Lets talk!");
//        }else{
//            System.out.println("Write a letter!");
//        }
//        System.out.println("Dat xe ra");
//        System.out.println("Chay toi quan");
//
        // Ternary operator -- Toan tư 3 ngoi
         String msg = isHeOnTime ? "Lets talk!" : "Write a letter!";
//         String msg = "";
//         if (isHeOnTime){
//             msg = "Let's talk";
//         }else {
//             msg = "Write a letter!";
//         }
        System.out.println("Dat xe ra");
        System.out.println("Chay toi quan");
    }
}
