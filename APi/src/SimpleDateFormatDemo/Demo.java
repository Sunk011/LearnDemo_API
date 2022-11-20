package SimpleDateFormatDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("y年M月d日H时m分s秒");
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println("-----------------");
        String ss = "2022-09-23 11:11:11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        Date d1 = sdf1.parse(ss);
        System.out.println(d1);
    }
}
