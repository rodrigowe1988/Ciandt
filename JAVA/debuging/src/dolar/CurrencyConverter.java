package dolar;

public class CurrencyConverter {

    public static final double DOLAR = 3.10;
    public static final double TAX = 0.06;

    public static double calculateTax(double quantity) {
        quantity *= DOLAR;
        quantity += quantity * TAX;
        return quantity;
    }
}
