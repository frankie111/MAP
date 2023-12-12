package ub1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee("bob", 1000),
                new Employee("dob", 2500),
                new Employee("rob", 5000));
        try {
            Calculator.employee_statistics(employeeList);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
