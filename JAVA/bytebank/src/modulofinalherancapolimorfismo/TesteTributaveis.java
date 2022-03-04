package modulofinalherancapolimorfismo;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.00);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto calc =  new CalculadorImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(cc.getSaldo());
        System.out.println(calc.getTotalImposto());
    }
}
