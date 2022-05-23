import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Main Start***");
        method1();
        System.out.println("***Main End***");
    }

    private static void method1() {
        System.out.println("***Method1 Start***");
        method2();
        System.out.println("***Method1 End***");
    }

    private static void method2() {
        System.out.println("***Method2 Start***");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite os nomes para adicionar à lista: ");
            String[] vect = sc.nextLine().split(" ");
            System.out.println("Digite o número do elemento da lista: ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
            e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("Input ERROR");
        }

        sc.close();
        System.out.println("***Method2 End***");

    }
}
