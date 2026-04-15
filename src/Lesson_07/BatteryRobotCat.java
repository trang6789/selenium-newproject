package Lesson_07;

//Inheritance: kế thừa | Sub-class, child class, concrete class
// Không extends multi class dc
public class BatteryRobotCat extends RobotCat{

    @Override
    public String charge() {
        return super.charge().concat(" with battery");
    }
}
