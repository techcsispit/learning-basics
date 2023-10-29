import java.util.*;
import java.text.*;
public class DateTimeYear {
    public static void main(String[] args) {
        Date current = new Date();
        System.out.println(current);

        SimpleDateFormat Time= new SimpleDateFormat("hh:mm:ss a"); //hh is for hours, ss for seconds and
        System.out.println(Time.format(current));                         //'a' shows AM/PM

        SimpleDateFormat Date= new SimpleDateFormat("dd/MM/yyyy"); //MM is for month and mm is for minutes
        System.out.println(Date.format(current));

        SimpleDateFormat Day= new SimpleDateFormat("EEEE"); //0 E's display date and time
        System.out.println(Day.format(current));  //1 - 3 E's display abbreviation of day's name and 4 E's display
                                                  //day correctly
    }
}
