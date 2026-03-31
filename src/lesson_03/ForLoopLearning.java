package lesson_03;
// for dùng khi biết trước số lần lặp
public class ForLoopLearning {

    public static void main(String[] args) {
        final int MAX_NUM = 18;
        for (int number = 0; number < MAX_NUM; number++) {
            System.out.println(number);
        }

        //Infinitive loop - vòng lặp vô hạn
//        for (;;) {
//            System.out.println("Hello");
//        }
//        for (int number = 0; number < 10; ) {
//            System.out.println("Hello");
//        }
//        // dừng lại ở -128
//        for (byte number = 0; number < 10; number--) {
//            System.out.println("Hello");
//        }
    }
}
