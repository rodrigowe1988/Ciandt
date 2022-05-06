import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class WhileTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qualquer = -99;
        int soma = 0;
        while (qualquer != 0) {
            System.out.println("Digite um número inteiro qualquer: ");
            qualquer = sc.nextInt();
            soma += qualquer;
        }
        System.out.println("Parabéns, vc acertou!!");
        System.out.println("A SOMA DOS NÚMEROS DIGITADOS FOI " + soma);
        sc.close();
    }
}
