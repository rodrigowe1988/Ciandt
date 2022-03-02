package bytebankherdado;

public class RemuneracaoTotal {

    private double total;

    public void calculaTotalRemuneracao(ControleBonificacao controle, Funcionario f) {
        this.total = controle.getSoma() + f.getSalario();
        System.out.println("total dos rendimentos: " + this.total);
    }
}
