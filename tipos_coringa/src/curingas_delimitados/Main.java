package curingas_delimitados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 1.1618);
        List<Object> myObjs = new ArrayList<>();
        List<Object> myObjs2 = new ArrayList<>();


        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs2);
        printList(myObjs2);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destination) {
        for (Number number: source) {
            destination.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object obj: list) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }
}
