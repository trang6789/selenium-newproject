package lesson_02;

public class BItWiseOperator {

    public static void main(String[] args) {
        // Evaluate
        if(method01() && method02()){
            System.out.println("\tInside the function");
        }

        System.out.println(4 | 5);
        System.out.println(4 & 5);
    }

    private static boolean method01(){
        System.out.println("method01");
        return false;
    }

    private static boolean method02(){
        System.out.println("method02");
        return true;
    }
}
