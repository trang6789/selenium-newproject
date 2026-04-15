package lesson_10_01;

import lesson_10_01.Contractor;
import lesson_10_01.Employee;
import lesson_10_01.FTE;

import java.util.Arrays;
import java.util.List;

public class SalaryCalculator {

    public int getTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary() + employee.getSupportMoney();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee fte = new FTE();
        Employee contractor = new Contractor();

        System.out.println(new lesson_10_01.SalaryCalculator().getTotalSalary(Arrays.asList(fte, contractor)));
    }
}
