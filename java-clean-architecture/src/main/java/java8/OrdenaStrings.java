package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Alura online");
        palavras.add("Editora casa do codigo");
        palavras.add("Caelum");

        //comparar por ordem alfabética
        Collections.sort(palavras);
        System.out.println(palavras);

        //comparação por tamanho da string
        Comparator<String> comparador = new ComparadorPorTamanho();
        Comparator<String> comparador2 = new ComparadorOrdemAlfabetica();
        Collections.sort(palavras, comparador);
        System.out.println(palavras);

        //ou podemos utilizar diretamente pois as Listas possuem o método sort()
        palavras.sort(comparador);
        System.out.println(palavras);
        palavras.sort(comparador2);
        System.out.println(palavras);

        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}

class ComparadorOrdemAlfabetica implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.charAt(0) < s2.charAt(0))
            return -1;
        if (s1.charAt(0) > s2.charAt(0))
            return 1;
        return 0;
    }
}