package DateDemo;

import java.text.ParseException;
import java.util.Date;

public class Demo  {
    public static void main(String[] args) throws ParseException {
    Date d= new Date();
        String s1  = DateUtils.dateToString(d, "y-M-d H:m:s");
        System.out.println(s1);
        String s2 = DateUtils.dateToString(d, "y M d");
        System.out.println(s2);

        String s= "2034-03-23 23:23:00";
        Date date = DateUtils.stringToDate(s, "y-M-d H:m:s");
        System.out.println(date);
    }

}
