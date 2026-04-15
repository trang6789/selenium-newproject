package lesson_10;

import java.util.Arrays;
import java.util.List;

public class SalaryCalculator {

//    Casting | Bad Practice
//    Break IS-A relationship khó maintain, dễ xảy ra sai sót
    public int getTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
//        for (Employee employee : employeeList) {
//            if(employee instanceof FTE){
//                totalSalary = totalSalary + employee.getSalary() + ((FTE) employee).getSupportMoney();
//            } else
//            totalSalary += employee.getSalary();
//        }
//        return totalSalary;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary() + employee.getSupportMoney();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee fte = new FTE("teo");
        Employee contractor = new Contractor("T1");

        System.out.println(new SalaryCalculator().getTotalSalary(Arrays.asList(fte, contractor)));
    }
}
