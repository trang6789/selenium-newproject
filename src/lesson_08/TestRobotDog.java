package lesson_08;

public class TestRobotDog {

    public static void main(String[] args) {
        RobotDog lulu = new RobotDog();
//        lulu.increaseDogId();
        RobotDog lala = new RobotDog();
//        lala.increaseDogId();
        System.out.println(lulu.getDogId());
        System.out.println(lala.getDogId());

        RobotDog.doAnotherThing();
    }
}
