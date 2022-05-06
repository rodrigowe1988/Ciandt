package arrays;

import java.util.Locale;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("How many products you have: ");
        int numberOfProducts = sc.nextInt();

        Array[] arrayNew = new Array[numberOfProducts];

        for(int i=0; i<arrayNew.length; i++) {
            sc.nextLine();
            System.out.println("Product name: ");
            String name = sc.nextLine();
            System.out.println("Product price: ");
            double price = sc.nextDouble();
            arrayNew[i] = new Array(name, price);
        }

        double totalPrice = 0.0;
        for (int i=0; i< arrayNew.length; i++) {
            totalPrice += arrayNew[i].price;
        }
        System.out.println("Average Price: $" + totalPrice / arrayNew.length);

        sc.close();
    }
}
