package uninter;


import java.util.Scanner;

public class Imc {

    public static double calcularImc () {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua altura em metros: ");
        float altura = sc.nextFloat();

        System.out.println("Digite seu peso em Kg: ");
        float peso = sc.nextFloat();

        return peso / (Math.pow(altura, 2));
    }

}
