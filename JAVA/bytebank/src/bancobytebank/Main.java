package bancobytebank;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(111, 1234);
        Cliente rodrigo = new Cliente("Rodrigo", "111.111.111-11", "Programador");
        conta1.setTitular(rodrigo);
        conta1.info();

        Conta conta2 = new Conta(112, 1234);
        Conta conta3 = new Conta(113, 1234);
        Conta conta4 = new Conta(114, 1234);

        System.out.println("Total de contas criadas até o momento: " + Conta.getTotalDeContas());

    }
}
