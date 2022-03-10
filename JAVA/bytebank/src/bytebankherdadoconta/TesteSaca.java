package bytebankherdadoconta;

public class TesteSaca {
    public static void main(String[] args)  {

        Conta conta1 = new ContaCorrente(111, 12345);
        conta1.deposita(1500);
        try {
            conta1.saca(2000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Ex: " + e.getMessage());
        }

        System.out.println(conta1.getSaldo());
    }
}
