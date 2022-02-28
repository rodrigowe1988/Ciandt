package uninter;

public class Nota {

    private double nota1;
    private double nota2;
    private int faltas;

    public Nota() {

    }
    public Nota(double nota1, double nota2, int faltas) {
        setNota1(nota1);
        setNota2(nota2);
        this.faltas = faltas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        if (faltas > 40 || faltas < 0)
            System.out.println("Número inválido de faltas");
        this.faltas = faltas;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota) {
        if(nota<0 || nota>10) {
            System.out.println("Nota inválida! Adicione uma nota entre 0 e 10... ");
            return;
        }
        this.nota1 = nota;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota) {
        if(nota<0 || nota>10) {
            System.out.println("Nota inválida! Adicione uma nota entre 0 e 10... ");
            return;
        }
        this.nota1 = nota;
    }

    void resultado() {
        double media = (nota1 + nota2) / 2;
        System.out.printf("Número de faltas: %d\n", faltas);
        if (faltas > 7)
            System.out.println("Reprovado por número de faltas...");
        else if (faltas < 0 || faltas > 40)
            System.out.println("Insira um número de faltas válido (entre 0 e 40).");
        else {
            if (media < 4)  {
                System.out.printf("Média: %.2f\n", media);
                System.out.println("Reprovado...");
            }
            else if (media < 7) {
                System.out.printf("Média: %.2f\n", media);
                System.out.println("Exame final...");
            }
            else if (media >= 7) {
                System.out.printf("Média: %.2f\n", media);
                System.out.println("Aprovado...");
            }

        }
    }
}
