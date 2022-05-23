package entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return super.getName() + " $ " + super.getPrice() + "(Customs fee: $ " + this.customsFee + ")";
    }
}
