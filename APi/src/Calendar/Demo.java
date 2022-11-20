package Calendar;

import java.util.Calendar;

public class Demo {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();//多态创建对象
//         System.out.println(c);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        int hour= c.get(Calendar.HOUR);
//        System.out.println(year+" "+month+" "+date+" "+hour);

//        c.add(Calendar.YEAR,-3);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        int hour= c.get(Calendar.HOUR);
//        System.out.println(year+" "+month+" "+date+" "+hour);
        c.set(2020, 18 ,7);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year+" "+month+" "+date);
    }
}
