package empresa;

public class ClienteNew implements Autenticavel{

    private AutenticavelNew autenticador;

    public ClienteNew() {
        this.autenticador = new AutenticavelNew();
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
