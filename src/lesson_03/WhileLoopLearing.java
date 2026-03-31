package lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

// khi không biết số lần lặp là bao nhiêu
public class WhileLoopLearing {

    public static void main(String[] args) {
        boolean isContinuing = true;

        while (isContinuing) {
//            System.out.println("====Game Menu=====");
//            System.out.println("1. Generate a random number (less than 1000)");
//            System.out.println("0. Exit!");
            printMenu();
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Please select option: ");
//            int option = scanner.nextInt();
            int option = getUserOption();

            if (option == 0) {
                isContinuing = false;
            }else if(option == 1){
                System.out.println("Your random number is: " + new SecureRandom().nextInt(1000));
            }else {
                System.out.println("Pls select correct option!");
            }
        }
        System.out.println("See you again!");
    }

    private static int getUserOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please select option: ");
        return scanner.nextInt();
    }

    private static void printMenu() {

        System.out.println("====Game Menu=====");
        System.out.println("1. Generate a random number (less than 1000)");
        System.out.println("0. Exit!");
    }
}
