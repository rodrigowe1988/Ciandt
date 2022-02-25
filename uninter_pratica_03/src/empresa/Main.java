package empresa;

public class Main {
    public static void main(String[] args) {
        Nota mario = new Nota();
        mario.setNota1(9);
        mario.setNota2(10);
        mario.resultado();
        mario.setNota1(2);
        mario.resultado();
    }
}
