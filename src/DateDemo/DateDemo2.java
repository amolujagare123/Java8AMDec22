package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    public static void main(String[] args) throws ParseException {

        String str = "01/19/2023";
        System.out.println(str);

        // String into date
        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sd.parse(str);
        System.out.println(date);

        // → dd-MMMM-yyyy
        String dateStr0= "23-June-2016" ;
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 = sd0.parse(dateStr0);
        System.out.println(dateStr0);
        System.out.println(date);


    }
}
