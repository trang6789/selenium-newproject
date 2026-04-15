package Lesson_07;

public class TestRobotCat {

    public static void main(String[] args) {
        RobotCat batteryRobotCat = new BatteryRobotCat();
        RobotCat solarRobotCat = new SolarRobotCat();
//      Class cho cho phép reuse - public
        batteryRobotCat.setName("Kitty");
        batteryRobotCat.setProductionDate("01/01/2026");

        solarRobotCat.setName("solarRobotCat");
        solarRobotCat.setProductionDate("01/01/2026");

        System.out.println(batteryRobotCat);
        System.out.println(solarRobotCat);

        System.out.println(batteryRobotCat.charge());
        System.out.println(solarRobotCat.charge());

        batteryRobotCat.doSth();

    }
}
