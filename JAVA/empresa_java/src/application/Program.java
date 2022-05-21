package application;

import entities.Employee;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int numberOfEmployees = sc.nextInt();
        sc.nextLine();

        ArrayList<Employee> listaDeEmpregados = new ArrayList<>();

        for (int i=0; i<numberOfEmployees; i++) {
            System.out.println("Outsourced (y/n)");
            char choice = sc.next().charAt(0);

            if (choice == 'y') {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Hours: ");
                int hours = sc.nextInt();
                System.out.println("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee employee = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
                listaDeEmpregados.add(employee);
            } else if (choice == 'n') {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Hours: ");
                int hours = sc.nextInt();
                System.out.println("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                Employee employee = new Employee(name, hours, valuePerHour);
                listaDeEmpregados.add(employee);
            }
        }

        System.out.println(listaDeEmpregados);


        sc.close();
    }

}
