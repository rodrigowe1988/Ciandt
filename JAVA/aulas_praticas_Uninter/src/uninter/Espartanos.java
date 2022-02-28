package uninter;

import java.util.Scanner;

public class Espartanos {

    public static int espartanos() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int guess = 0;
        while (guess != 30000) {
            System.out.println("LEÔNIDAS: Quantos persas iremos enfrentar? ");
            guess = sc.nextInt();

            if (guess < 30000)
                System.out.println("LEÔNIDAS: Um pouco mais...");
            else if (guess > 30000)
                System.out.println("LEÔNIDAS: Um pouco menos...");
            else if (guess <= 0)
                System.out.println("Não temos como enfrentar um número negativo ou nulo...");
            else {
                System.out.println("LEÔNIDAS: Exatamente. Seremos nós contra 30000 persas...");
                Thread.sleep(2000);
                System.out.println("TIGAS: Você tem que parar de arrumar essas confusão, Leônidas...");
            }

        }

        return guess;
    }
}