package matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a dimensão da matriz? ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i=0; i< mat.length; i++) {
            for(int j=0; j< mat[i].length; j++) {
                System.out.printf("Adicione o elemento [%d][%d]\n", i, j);
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Main diagonal: ");
        for (int i=0; i<mat.length; i++) {
            System.out.printf(mat[i][i] + " ");
        }

    }
}
