package employee;

import dolar.CurrencyConverter;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Joao Silva", 6000, 1000);

        System.out.println(employee.toString());
        employee.increaseSalary(10);
        System.out.println(employee.toString());


    }
}
