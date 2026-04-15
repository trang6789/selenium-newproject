package lesson_09_01;

import java.util.ArrayList;
import java.util.List;
import static lesson_09_01.HouseWithBuilder.Builder;

public class TestBuilder {

    public static void main(String[] args) {
//        Ko cần import class
//      HouseWithBuilder.Builder builder = new HouseWithBuilder.Builder();

//      Import class rồi, chỉ cần sử dụng inner class
        Builder builder = new Builder();
//        builder.setColor("Pink");
//        builder.setMainDoor(10);
//        builder.setWindows(1);
//        HouseWithBuilder house1 = builder.build();

//        Method chaining: gọi tất cả method of object
        HouseWithBuilder house1 = builder
                .setColor("Pink")
                .setMainDoor(10)
                .setWindows(1)
                .build();
        System.out.println(house1);

    }
}
