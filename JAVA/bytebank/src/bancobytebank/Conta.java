package bancobytebank;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalDeContas;

    public Conta(int numero, int agencia) {
        Conta.totalDeContas++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        } else
            return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else
            return false;
    }
    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia < 0){
            System.out.println("Não usar valor de agência negativo...");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    void info() {
        System.out.printf("Saldo: %.2f\n" ,this.saldo);
        System.out.printf("Agência: %d\n" ,this.agencia);
        System.out.printf("Número: %d\n" ,this.numero);
        System.out.printf("%s" , this.getTitular().getNome());
        System.out.println("Total de contas criadas: " + totalDeContas);
    }
}
