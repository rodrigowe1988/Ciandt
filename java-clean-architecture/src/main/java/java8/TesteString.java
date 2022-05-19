package java8;

public class TesteString {
    public static void main(String[] args) {
        String[] palavras = {"Um", "Dois", "Três", "Quatro"};

        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }

        for(String s: palavras) {
            System.out.println(s);
        }


    }
}
