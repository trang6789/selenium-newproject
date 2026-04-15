package lesson_10;

public class Contractor extends Employee{


    public Contractor(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return 30000;
    }
}
