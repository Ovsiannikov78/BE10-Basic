package Task_SalaryOfEmployee;

import java.util.function.Function;
import java.util.function.Supplier;

public class SalaryOfEmployee {
    public static void main(String[] args) {
        Employee javaDeveloper1 = new Employee("Vlad", 2000);
        Employee javaDeveloper2 = new Employee("Jack", 3000);

    // 5. Given a class Employee with name and salary.
    // Return an employee salary using 1. Supplier, 2. Function.

        Supplier<Integer> getSalaryOfEmployeeWithSupplier = javaDeveloper1::getSalary;
        System.out.println(getSalaryOfEmployeeWithSupplier.get());

        Function<Employee,Integer> getSalaryOfEmployeeWithFunction = Employee::getSalary;
        System.out.println(getSalaryOfEmployeeWithFunction.apply(javaDeveloper2));
    }
}
