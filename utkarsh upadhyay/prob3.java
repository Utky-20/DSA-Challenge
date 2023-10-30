
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 using simpledate we took the american value which is 12 hours and converted it to British format which is 24 hours 
 */
public class prob3 {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat american = new SimpleDateFormat("HH:mm");
        SimpleDateFormat british = new SimpleDateFormat("hh:mm a");
        Date date = british.parse("6:30 PM");
        System.out.println(british.format(date) + " = " + american.format(date));
    }
}