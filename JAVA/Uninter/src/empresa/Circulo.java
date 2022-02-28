package empresa;

import java.util.Scanner;

public class Circulo extends FormaGeometrica{
    static double PI = 3.1415;

    public void calculaArea() {
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        area = PI * (raio * raio);
        System.out.printf("A área do círculo é de %.2f m2.\n", area);
    }
}
