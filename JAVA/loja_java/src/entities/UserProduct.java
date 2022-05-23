package entities;


import java.text.SimpleDateFormat;
import java.util.Date;

public class UserProduct extends Product{

    private Date manufactureDate;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UserProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return super.getName() + "(used)" + " $ " + super.getPrice() + " " + sdf.format(manufactureDate);
    }
}
