package employeeexercise;

public class Employee {
    private int id;
    private String name;
    private double wage;

    public Employee(int id, String name, double wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWage() {
        return wage;
    }

    public void isTheCorrectId(Employee employee, double percent) {
        if(employee.id == this.id) {
            modifeWage(percent);
        }
    }
    public void modifeWage(double percent) {
        double modifier = (percent/100) * this.wage;
        this.wage += modifier;
    }

    @Override
    public String toString() {
        return id + ", " + name +
                ", " + wage;
    }
}
