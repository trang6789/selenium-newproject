package lesson_06;

public class RobotCat {
//Class field - có default value
    private String name;

    //    public RobotCat(){
//    Local variable - ko có default value, cần khởi tạo cho nó
//    String name  = "a";
//       System.out.println("Hello");
//    }
//    Overloading của constructor. Default constructor sẽ ko dc tạo nếu đã có constructor khác
//    public RobotCat(String name){
//        this.name = name;
//    }
//    // Setter - thay đổi attribute object đang mang
//    public void setName(String name){
//        this.name = name;
//    }
//
//    //Getter - trả về gtri attribute object đang mang
//    public String getName(){
//        return name;
//    }
    public void greeting(){
        System.out.println("Hello, my name is ".concat(this.name));
    }



}
