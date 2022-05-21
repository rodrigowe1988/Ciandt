package entities;

public class OutsourceEmployee extends Employee {

    private double totalValue;

    public OutsourceEmployee(){}

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.totalValue = additionalCharge(additionalCharge);
        this.totalValue = Math.round(this.totalValue);
    }

    public double additionalCharge(double charge) {
        double total = charge * 1.1;
        return total;
    }

    @Override
    public double payment() {
        return super.payment() + this.totalValue;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
