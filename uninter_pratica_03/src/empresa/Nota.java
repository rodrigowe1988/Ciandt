package empresa;

public class Nota {
    private double nota1;
    private double nota2;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 < 0 || nota1 > 10){
            System.out.println("Nota inválida!");
            return;
        }
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota1 < 0 || nota1 > 10){
            System.out.println("Nota inválida!");
            return;
        }
        this.nota2 = nota2;
    }

    void resultado() {
        double media = (nota1 + nota2) / 2;

        System.out.printf("Média: %.2f\n", media);
        if (media < 4)
            System.out.println("Reprovado...");
        else if (media < 7)
            System.out.println("Exame Final...");
        else
            System.out.println("Aprovado...");
    }


}
