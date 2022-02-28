package uninter;

import java.util.Scanner;

public class Avaliacao {

        Scanner sc = new Scanner(System.in);
        //System.out.println("Quantas notas serão inseridas: ");
        //int totalNotas = sc.nextInt();
        double nota1, nota2, nota3;

        public Avaliacao() {

        }

        public Avaliacao(double nota1, double nota2, double nota3) {
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

        public double mediaAritmerica() {
                return (nota1 +  nota2 + nota3) / 3;
            }

            public double mediaPonderada() {
                return ((nota1 * 2) + (nota2 * 3) + (nota3 * 3)) / 9;
            }

}
