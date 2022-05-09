package employeeexercise;

public class Main {
    public static void main(String[] args) {
        Employee teste = new Employee(123, "Rodrigo", 5000.00);
        Employee teste2 = new Employee(111, "Rogério", 6000.00);

        System.out.println(teste);
        teste.modifeWage(10);
        System.out.println(teste);

        teste.isTheCorrectId(teste, 15);
        teste2.isTheCorrectId(teste2, 10);
        System.out.println("-----------------");
        System.out.println(teste);
        System.out.println(teste2);

    }
}
