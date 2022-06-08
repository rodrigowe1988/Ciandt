package entities;

public class SomandoSaldoDeContas {

    public String data;
    public double totalInvestidoNoDia;
    private static int qtdDeTotaisCriados;

    public SomandoSaldoDeContas(String data) {
        this.data = data;
        SomandoSaldoDeContas.qtdDeTotaisCriados++;
        System.out.println("Data: " + data);
    }

    public void metodoSomar(double [] investimentos) {
        double totalInvestido = 0;
        for (int i = 0; i < investimentos.length; i++) {
            totalInvestido += investimentos[i];
        }
        System.out.printf("O total investido é de R$%.2f.\n", totalInvestido);
        System.out.println("Números de dias já salvos: " + qtdDeTotaisCriados);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        this.totalInvestidoNoDia = totalInvestido;
    }
}
