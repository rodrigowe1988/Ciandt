package memoryarrayslists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();
        List<String> listR = new ArrayList<>();

        list.add("Rodrigo");
        list.add("Rogério");
        list.add("Ana");
        list.add("Maria");

        list.removeIf(x -> x.charAt(0) == 'M');

        for (String teste: list) {
            if(teste.charAt(0) == 'R') {
                listR.add(teste);
            }
        }

        for (String name: list) {
            System.out.println(name);
        }

        System.out.println(listR);

        System.out.println("--------------------");
        System.out.println("Index of Rodrigo: " + list.indexOf("Rodrigo"));
        System.out.println("Index of Marcos: " + list.indexOf("Marco"));

        System.out.println("---------------------");
        List<String> listA = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println(listA);

        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(2) == 'g').findFirst().orElse(null);
        System.out.println(name);
    }
}
