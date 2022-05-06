package contas;

public class Conta {
    private String titular;
    private int conta;
    private double saldo;
    private double taxa = 5.0;

    public Conta(){}

    public Conta(int conta, String titular, double initialDeposit) {
        this.conta = conta;
        this.titular = titular;
        deposita(initialDeposit);
    }
    public Conta(int conta, String titular) {
        this.conta = conta;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double deposita(double value) {
        return this.saldo += value;
    }

    public double saca(double value) {
        double totalDescontando = value + taxa;
        return this.saldo -= totalDescontando;
    }

    @Override
    public String toString() {
        return "Account data: " +
                "Account " +
                conta +
                ", Holder: '" + titular +
                ", Balance: " + saldo +
                '}';
    }
}
