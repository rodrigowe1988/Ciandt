package contas;

import java.util.Locale;
import java.util.Scanner;

public class TestContas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta = null;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String name = sc.next();
        System.out.println("Is there an initial deposit value? (y/n)");
        sc.nextLine();
        char question = sc.next().charAt(0);

        if (question == 'y') {
            System.out.println("Enter initial deposit value: ");
            double value = sc.nextDouble();
            conta = new Conta(number, name, value);
        } else {
            conta = new Conta(number, name);
        }
        System.out.println(conta);
    }
}
