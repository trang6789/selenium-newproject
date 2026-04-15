package Lesson_07;

//Inheritance: kế thừa | Sub-class, child class, concrete class
// IS-A relationship
public class WindRobotCat extends RobotCat{

    @Override
    public String charge(){
        return super.charge().concat(" with wind energy!");
    }
}
