package uninter;

public class Conta {

    int numero;
    String titular;
    float saldo;
    float limite;

    public Conta() {

    }

    public Conta(int numero, String titular, float saldo, float limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    boolean sacar(double valor) {
        if (valor > this.saldo || valor <= 0 || valor > this.limite){
            return false;
        }
        else
            this.saldo -= valor;
        return true;
    }

    boolean depositar(double valor) {
        if(valor <= 0)
            return false;
        else
            this.saldo += valor;
        return true;
    }

    void info() {
        System.out.println(numero);
        System.out.println(titular);
        System.out.println(saldo);
        System.out.println(limite);
    }

}
