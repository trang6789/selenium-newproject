package lesson_04;
//chạy ít nhất 1 lần rồi mới kiểm tra
import java.security.SecureRandom;
import java.util.Scanner;

//ít nhất làm dc 1 lần
public class DoWhileLoop {

    public static void main(String[] args) {
        //infinitive loop
        boolean isSthStillTrue =  false;
        int guessingTime = 0;
        int randomNumber = new SecureRandom().nextInt(11);
        System.out.println("randomNumber: " + randomNumber);
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Pls input the number: ");
            int userNumber = scanner.nextInt();

            if(userNumber == randomNumber) {
                System.out.println("Hooray!!!");
                break;
            }
            guessingTime++;
        }while (guessingTime <3);

        System.out.println("See you again!");
    }
}
