package BaoZhuang;

import java.util.Date;

public class IntegerDemo {
    public static void main(String[] args) {
          /* //装箱
        Integer i = Integer.valueOf(100);
        //自动装箱
        Integer i1 = 100;
        //拆箱
        i1=i1.intValue()+200;//自动装箱
        //自动拆箱+自动装箱
        i1+=100;*/
        Date d1 = new Date();
        System.out.println(d1);

        long date= 1000*60*60;
        Date d2 = new Date(date);
        System.out.println(d2);
        Date d= new Date();
        System.out.println(d.getTime());
        System.out.println(d);
        d.setTime(date);
        System.out.println(d);
    }
}
