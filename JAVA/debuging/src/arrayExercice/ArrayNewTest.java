package arrayExercice;

import java.util.Locale;
import java.util.Scanner;

public class ArrayNewTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented? ");
        int numberOfRooms = sc.nextInt();
        sc.nextLine();

        Array[] array = new Array[numberOfRooms];


        for (int i=0; i< array.length; i++){
            System.out.println("Student name: ");
            String name = sc.next();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.println("Room's number: ");
            int number = sc.nextInt();
            array[i] = new Array(name, email, number);
        }

        System.out.println(array[1]);


        sc.close();
    }
}
