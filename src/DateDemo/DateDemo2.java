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
        Date date = null;
        try {
            date = sd.parse(str);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(date);

        // → dd-MMMM-yyyy
        String dateStr0= "23-June-2016" ;
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 = sd0.parse(dateStr0);
        System.out.println(dateStr0);
        System.out.println(date);

        // → dd | MMMM yy hh:mm
        String dateStr1= "23 | June 16  8:34" ;
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println(dateStr1);
        System.out.println(date1);


        // --> yyyy-MM-dd | hh:mm:ss
        String dateStr2= "2016-06-23 | 8:34:23";
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        Date date2 = sd2.parse(dateStr2);
        System.out.println(dateStr2);
        System.out.println(date2);






    }
}
