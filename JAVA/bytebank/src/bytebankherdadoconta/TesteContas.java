package bytebankherdadoconta;

public class TesteContas {
    public static void main(String[] args) {
        /*ContaCorrente cc = new ContaCorrente(111, 12345);
        cc.deposita(200);
        cc.info();

        ContaPoupanca cp = new ContaPoupanca(111, 12346);
        cp.deposita(500);
        cp.info();
        cp.transfere(50, cc);
        cc.info();
        cp.info();
        */

        Conta contaTeste = new ContaCorrente(111, 1234567);
        contaTeste.deposita(2390);
        System.out.println(contaTeste.getSaldo());
    }
}
