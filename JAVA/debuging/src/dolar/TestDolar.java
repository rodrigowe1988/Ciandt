package dolar;

import java.util.Locale;
import java.util.Scanner;

public class TestDolar {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("What is the dollar price? ");
//        double priceOfDolar = sc.nextDouble();
//
        System.out.println("How many dollars will be bought? ");
        double dollarsQuantity = sc.nextDouble();

//        double total = priceOfDolar * dollarsQuantity;
//        double totalWithTaxes = total + total * 0.06;
//
//        System.out.println("Amount to be paid in reais = " + totalWithTaxes);
        System.out.println(CurrencyConverter.calculateTax(dollarsQuantity));

    }
}
