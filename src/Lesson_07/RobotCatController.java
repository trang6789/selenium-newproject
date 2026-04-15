package Lesson_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// nơi xử lý loại dữ liệu thuộc về model mình tạo ra
//Functional programming
public class RobotCatController {

//    public static void main(String[] args) {
//        RobotCat batteryRobotCat = new BatteryRobotCat();
//        RobotCat solarRobotCat = new SolarRobotCat();
//        RobotCat windRobotCat = new WindRobotCat();
//
//        RobotCatController robotCatController = new RobotCatController();
//        robotCatController.chargeRobot(Arrays.asList(batteryRobotCat, solarRobotCat, windRobotCat));
//    }

    public void chargeRobot(List<RobotCat> robotCatList) {
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }
    }
}
