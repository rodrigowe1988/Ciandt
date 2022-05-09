package employeeexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
//        Employee teste = new Employee(123, "Rodrigo", 5000.00);
//        Employee teste2 = new Employee(111, "Rogério", 6000.00);
//
//        list.add(teste);
//        list.add(teste2);
        System.out.println("How many employees will be registered? ");
        int numberOfEmployees = sc.nextInt();

        for (int i=0; i<numberOfEmployees; i++) {
            System.out.println("Type the id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Type the name: ");
            String name = sc.next();
            System.out.println("Type the wage: ");
            double wage = sc.nextDouble();
            Employee teste = new Employee(id, name, wage);
            list.add(teste);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idToRiseWage = sc.nextInt();
        sc.nextLine();

// Integer pos = position(list, idsalary);

        Employee emp = list.stream().filter(x -> x.getId() == idToRiseWage).findFirst().orElse(null);

        // if (pos == null) {
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            //list.get(pos).increaseSalary(percent);
            emp.modifeWage(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
