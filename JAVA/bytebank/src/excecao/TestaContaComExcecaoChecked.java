package excecao;

public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.deposita();
        try {
            conta1.deposita();
        } catch (MinhaExcecao ex) {
            System.out.println("tratamento...");
        }
    }
}
