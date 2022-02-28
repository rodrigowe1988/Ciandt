package uninter;

public class AlunoNew {

    String nome;
    int matricula;
    double desconto;
    Curso curso;

    public AlunoNew() {

    }
    public AlunoNew(String nome, int matricula, double desconto, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.desconto = desconto;
        this.curso = curso;
    }

    void descrever() {

    }

    void info(){
        System.out.printf("Nome do aluno: %s.\n", nome);
        System.out.printf("Matrícula: %d.\n", matricula);
        System.out.printf("Desconto do aluno: %.2f.\n", curso.mensalidade * (desconto));
        curso.info();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Mensalidade do curso com desconto: " + (curso.mensalidade - (curso.mensalidade * (desconto))));
    }
    
    double pagamento() {
        return curso.mensalidade * (1 - desconto);
    }
}
