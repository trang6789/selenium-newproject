package lesson_08;

public class RobotDog {
// Class member : class variable(trực thuộc class, ko trực thuộc object dc sinh ra) + class method (static)
// class member dc sinh ra trước khi object dc sinh ra. Static chỉ gọi dc static. Non-static gọi dc cả non-static và static.
// Static: shared -dùng chung giữa các object dc tạo ra từ class này
// chỉ override(object) dc class varriable bằng static block. Ko override dc class method
    public static int dogId = 0;

    private String name;

    public void increaseDogId(){
        dogId++;
    }

    public static int getDogId() {
        return dogId;
    }
//    Static method ko thể refer tới non-static.
//    Non-static/ static có thể gọi tới static
//    Non-static có thể gọi dc hết
    public static void doSth(){
        doAnotherThing();
//        getDogId(); ko thể gọi tới
    }

    public static void doAnotherThing(){

    }
}
