package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 =  new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L *5L);

        Date y1 = sdf1.parse("09/05/2022");
        Date y2 = sdf2.parse("09/05/2022 07:33:01");

        System.out.println(sdf2.format(y1));
        System.out.println(sdf2.format(y2));
        System.out.println(x1);
        System.out.println("Milissegundos: " + System.currentTimeMillis());
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println("---------------------------");
        System.out.println(sdf3.format(y1));
        System.out.println(sdf3.format(y2));
        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
    }
}
