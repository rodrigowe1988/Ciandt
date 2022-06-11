public class Array {

    public static void main(String[] args) {

        int[] array1 = new int[5];
        array1[2] = 42;

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array1.length; counter++)
            System.out.printf("%5d%8d%n", counter, array1[counter]);

        int[] array2 = {1, 2, 3, 4, 5};
        for (int number: array2) {
            System.out.println(number);
        }

    }
}
