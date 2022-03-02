package bytebankherdado;

public class TesteReferencia {

    public static void main(String[] args) {
        Funcionario g1 = new Gerente();
        g1.setNome("Rodrigo");
        g1.setSalario(5000);

        Funcionario f = new Funcionario();
        f.setSalario(2000);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(3000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        //controle.registra(f);
        //controle.registra(ev);

        System.out.println(controle.getSoma());
        RemuneracaoTotal remuneracaoTotal = new RemuneracaoTotal();
        remuneracaoTotal.calculaTotalRemuneracao(controle, g1);
    }
}
