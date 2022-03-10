package excecao;

public class FluxoComError {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        } catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");

//        ArithmeticException exception = new ArithmeticException("Aqui deu um erro na aplicação!");
//        throw exception;

        throw new MinhaExcecao("Ops. Deu erro aqui, hein!?");


//        for(int i = 1; i <= 5; i++) {
//            System.out.println(i);
//            int a = i / 0;
//            Conta conta1 = null;
//            conta1.deposita();
        }
        //System.out.println("Fim do metodo2");
}
