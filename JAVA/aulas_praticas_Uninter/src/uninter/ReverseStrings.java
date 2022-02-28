package uninter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ReverseStrings {

    public static ArrayList<String> reverseStrings() {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String msg;
        System.out.println("Digite quantos nomes você irá inserir: ");
        int total  = teclado.nextInt();

        System.out.println("Digite os nomes: ");
        for (int i = 0; i < total; i++){
            msg = teclado.next();
            nomes.add(msg);
        }
        Collections.reverse(nomes);

        return nomes;
    }


}
