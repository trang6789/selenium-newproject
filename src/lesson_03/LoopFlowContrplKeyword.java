package lesson_03;

public class LoopFlowContrplKeyword {

    public static void main(String[] args) {

        for (int index = 0; index < 10; index++) {
            if(index == 3){
                break;      // thoát ra khỏi vòng lặp
//                continue; // Vòng lặp vẫn tiếp tục sau khi bỏ qua lần lặp
            }
            System.out.println(index);
        }

    }
}
