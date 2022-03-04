package empresa;

public class AdministradorNew extends Funcionario implements Autenticavel{

    private AutenticavelNew autenticador;

    @Override
    public double getBonificacao() {
        return 500;
    }


    public AdministradorNew() {
        this.autenticador = new AutenticavelNew();
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
