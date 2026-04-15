package lesson_08;

public class Cho {
    //  Có thể override class variable, nhưng ko thể override class method
    protected static String name = "Cho";

    public void sayHello(){
        System.out.println("Hello my name is ".concat(name));
    }

    public static void doSth(){
        System.out.println("Hello my name is ".concat(name));
    }
}
