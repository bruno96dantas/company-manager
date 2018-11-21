package company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        SalariedEmployee employee = new SalariedEmployee();

        hire(employee, employeeList);

        raise(employee, Role.EXECUTIVE);

    }

    private static void hire(Employee employee, List<Employee> employeeList) {
        employeeList.add(employee);
        System.out.println("A new employee was hired and your salary is: " + employee.Payment());
    }

    private static void fire(Employee employee, List<Employee> employeeList) {
        employeeList.remove(employee);
        System.out.println("The employee was hired!");
    }

    private static void raise(Employee employee, Role role) {
        employee.setRole(role);
        System.out.println("The employee was raised to " + employee.getRole());
    }

}
