package lesson_04;

import java.security.SecureRandom;

public class FunctionLearning {
    /*
     * Maintenance: cao -> thấp
     * Extendable: thấp -> cao
     * Reliable: thấp -> cao
     * */
    // DRY: Don't repeat yourself
    public static void main(String[] args) {
        sayHello("Teo"); //argument

        System.out.println(getRandomNumber(10));

    }

    // Access Modifier                 //parameter
    public static void sayHello(String name) {
        System.out.println("Hello" +name);
    }

    public static int getRandomNumber(int boundaryNumber){
        //local variable
        int randomNumber = new SecureRandom().nextInt(boundaryNumber);
        return randomNumber;
    }

    public static void printNumber(){
        for (int number = 0; number < 5; number++) {
            if(number == 3)
                return;
            System.out.println(number);
        }
        System.out.println("End of program!");
    }
}
