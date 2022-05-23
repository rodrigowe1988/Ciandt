package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UserProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        Product prod01 = new Product("TV", 499.00);
        Product prod02 = new ImportedProduct("Laptop", 349.0, 389.0);
        Date date = sdf.parse("01/01/2013");
        Product prod03 = new UserProduct("Macbook", 799.00, date);

        System.out.println(prod01.priceTag());
        System.out.println(prod02.priceTag());
        System.out.println(prod03.priceTag());

    }
}
