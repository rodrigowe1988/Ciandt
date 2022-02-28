package empresa;

import java.util.Scanner;

public class Quadrado extends FormaGeometrica{
    public void calculaArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a medida do lado: ");
        double lado = sc.nextDouble();
        area = lado * lado;
        System.out.printf("A área do quadrado é de %.2f m2.\n", area);
    }
}
