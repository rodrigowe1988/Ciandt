import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Home Theater");
        set.add("Celular");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));
        set.removeIf(e -> e.charAt(0) == 'T');

        for (String item: set) {
            System.out.println(item);
        }
    }
}
