import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@email.com");
        cookies.put("phone", "99771122");

        //cookies.remove("email");
        cookies.put("phone", "99771123");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES: ");
        for (String key: cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
