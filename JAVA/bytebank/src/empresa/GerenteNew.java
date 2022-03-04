package empresa;

//Gerente é um funcionário, herda da classe Funcionario e assina o contrato Autenticavel
public class GerenteNew extends Funcionario implements Autenticavel {

    private AutenticavelNew autenticador;

    public GerenteNew() {
        this.autenticador = new AutenticavelNew();
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public double getBonificacao() {
         return super.getSalario();
    }
}
