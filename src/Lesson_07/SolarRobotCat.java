package Lesson_07;

//Inheritance: kế thừa | Sub-class, child class, concrete class
// IS-A relationship

//Functional programming
public class SolarRobotCat extends RobotCat{

    @Override
    public String charge(){
        return super.charge().concat(" with solar energy!");
    }
}
