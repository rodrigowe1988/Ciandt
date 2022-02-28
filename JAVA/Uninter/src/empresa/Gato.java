package empresa;

public interface Gato implements Animal{

    @Override
    default void emitirSom() {
        System.out.println("Miau, miau...");
    }

    @Override
    default void dormir() {
        System.out.println("zzzz...");
    }
}
