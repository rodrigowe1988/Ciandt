package uninter;

public class Curso {
    String nome;
    double mensalidade;

    public Curso() {

    }

    public Curso(String nome, double mensalidade) {
        this.nome = nome;
        this.mensalidade = mensalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    void info() {
        System.out.println("Nome curso: " + nome);
        System.out.println("Mensalidade curso: " + mensalidade);

    };
}
